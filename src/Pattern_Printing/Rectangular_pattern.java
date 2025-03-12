package Pattern_Printing;

import java.util.Scanner;

public class Rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no-of Rows : ");
        int m= sc.nextInt();
        System.out.println("Enter no-of colns : ");
        int n=sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j<n; j++) {
                System.out.print(i);

            }
            System.out.println();

        }
    }
}
