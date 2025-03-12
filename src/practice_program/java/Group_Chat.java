package practice_program.java;

import java.net.*;
import java.io.*;
import java.util.*;

public class Group_Chat {

    private static final String TERMINATE = "Exit";
    static String name;
    static volatile boolean finished = false;

    public static void main(String[] args) {
        if (args.length != 2)
            System.out.println("Two arguments required: <multicast-host> <port-number>");
        else {
            try {
                // Get multicast group and port number from arguments
                InetAddress group = InetAddress.getByName(args[0]);
                int port = Integer.parseInt(args[1]);

                // Create scanner for user input
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your name: ");
                name = sc.nextLine();

                // Create a multicast socket for the given port
                MulticastSocket socket = new MulticastSocket(port);

                // Set Time-to-Live for the socket to 0 (local communication only)
                socket.setTimeToLive(0); // For a subnet, set it as 1.

                // Join the multicast group
                socket.joinGroup(group);

                // Start a new thread for reading incoming messages
                Thread t = new Thread(new ReadThread(socket, group, port));
                t.start();

                // Start typing messages and send them to the group
                System.out.println("Start typing messages...\n");

                while (true) {
                    String message = sc.nextLine();
                    if (message.equalsIgnoreCase(Group_Chat.TERMINATE)) {
                        finished = true;
                        socket.leaveGroup(group);
                        socket.close();
                        break;
                    }
                    message = name + ": " + message;

                    // Send the message as a datagram packet to the multicast group
                    byte[] buffer = message.getBytes();
                    DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, group, port);
                    socket.send(datagram);
                }
            } catch (SocketException se) {
                System.out.println("Error creating socket");
                se.printStackTrace();
            } catch (IOException ie) {
                System.out.println("Error reading/writing from/to socket");
                ie.printStackTrace();
            }
        }
    }
}

class ReadThread implements Runnable {
    private MulticastSocket socket;
    private InetAddress group;
    private int port;
    private static final int MAX_LEN = 1000;

    // Constructor to initialize socket, group, and port
    ReadThread(MulticastSocket socket, InetAddress group, int port) {
        this.socket = socket;
        this.group = group;
        this.port = port;
    }

    @Override
    public void run() {
        while (!Group_Chat.finished) {
            byte[] buffer = new byte[ReadThread.MAX_LEN];
            DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, group, port);
            String message;

            try {
                // Receive a message from the group
                socket.receive(datagram);
                message = new String(buffer, 0, datagram.getLength(), "UTF-8");

                // Print the message if it's not from the current user
                if (!message.startsWith(Group_Chat.name)) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                System.out.println("Socket closed!");
            }
        }
    }
}
