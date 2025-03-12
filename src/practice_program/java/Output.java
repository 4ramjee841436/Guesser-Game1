package practice_program.java;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values for a, b, and c :");
        String[] input = sc.nextLine().split(" ");

        int a = Integer.parseInt(input[0]); // for first input
        int b = Integer.parseInt(input[1]); // for 2nd input
        int c = Integer.parseInt(input[2]); // for 3rd input

        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }

    }
}
