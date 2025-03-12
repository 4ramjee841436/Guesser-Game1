package practice_program.java;
import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;
        System.out.println("Enter the Seconds:");
        int sec = sc.nextInt();

        H = sec / 3600;
        sec=sec%3600;

        M = sec / 60;
        sec=sec %60;


        System.out.println(H + ":" + M + ":" + sec);
    }
}
