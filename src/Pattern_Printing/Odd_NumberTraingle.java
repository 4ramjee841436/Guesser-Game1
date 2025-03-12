package Pattern_Printing;

import java.util.Scanner;

public class Odd_NumberTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values :: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(2*j-1+" ");

            }
            System.out.println();
        }
    }
}
