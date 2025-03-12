package Pattern_Printing;

import java.util.Scanner;

public class Diamond_print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N Values :: ");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 2*(n-i); j >=0 ; j=i-2) {
                System.out.print(" ");
            }
            for (int j = 2*(i+1); j >=0; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
