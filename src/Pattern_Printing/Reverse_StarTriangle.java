package Pattern_Printing;

import java.util.Scanner;

public class Reverse_StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values :: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
