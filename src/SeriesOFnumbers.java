import javax.swing.*;
import java.util.Scanner;
// find the sum of series of n number:1-2+3-4+5-6+.............+n;
public class SeriesOFnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int series = 0;
        for (int i = 1; i <= n; i++) {
            if (i% 2 == 0) {
                series -= i;
            } else {
                series += i;

            }
        }
            System.out.println("sum of series of number is:" + series);
        }
    }

