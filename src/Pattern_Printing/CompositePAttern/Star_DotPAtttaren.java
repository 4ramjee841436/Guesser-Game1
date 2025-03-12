package Pattern_Printing.CompositePAttern;

import java.util.Scanner;

public class Star_DotPAtttaren {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N value :: ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("* "+" "); // spaces loop

            }

            for (int j = 1; j <=i; j+=2){
                System.out.print(". "+" "); // * loop

            }
            System.out.println();
        }
    }
}
