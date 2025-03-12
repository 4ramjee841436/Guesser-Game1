package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N values ::  ");
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {

            // for space (N-i)
            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <i; j++) {
//                System.out.print("* ");
                System.out.print((char)(i+64)+" "); // A,BB,CCC,DDDD,EEEEE.....
//                System.out.print((char)(65+j)+" "); // A,AB,ABC,ABCD,ABCDE.......

            }
            System.out.println();
        }
    }
}
