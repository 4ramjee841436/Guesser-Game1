package Pattern_Printing;

import java.util.Scanner;

public class Alphabatical_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N value :: ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                // type casting -->> char(j+64)=(j=1)-> char(65)-> 'A'
//                System.out.print((char)(j+64)+" ");// for extra space " "

                // print AAAA,BBBB,CCCC
                System.out.print((char)(i+64)+" ");

            }
            System.out.println();
        }
    }
}
