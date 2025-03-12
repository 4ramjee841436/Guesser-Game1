package Pattern_Printing.Special_Pattern;
import java.util.Scanner;
public class Binary_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N values :: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                } else {
                    if (j % 2 == 1)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
    }
}
