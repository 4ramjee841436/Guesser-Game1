package practice_program.java;
import java.util.Scanner;
public class Binary_Sign_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input ");
        String input = sc.nextLine().toUpperCase();

        int result = input.charAt(0) - '0';

        for (int i = 1; i < input.length(); i += 2) {
            char operation = input.charAt(i);
            int nextNum = input.charAt(i + 1) - '0';

            switch (operation) {
                case 'A':
                    result &= nextNum;
                    break;
                case 'B':
                    result |= nextNum;
                    break;
                case 'C':
                    result ^= nextNum;
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
                    return;
            }
        }
        System.out.println("Result: " + result); // 1C0C1C1A0B1
        sc.close();
    }
}
