package Pattern_Printing.CompositePAttern;

import java.util.Scanner;

public class Rhombus_StarTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N value :: ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+" "); // spaces loop

            }

            for (int j = n; j >=1; j--) { // for(j=1;j<=n;j++)
                System.out.print("* "+" ");

            }
            System.out.println();
        }
    }
}
