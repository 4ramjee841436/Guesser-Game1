package PW_COURSE.java;
import practice_program.java.Reverse;

import java.util.Scanner;
public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal value : ");
        int n = sc.nextInt();
        String res = "";
        while (n > 0) {
            if (n % 2 == 1) {
                res += '1';
            } else {
                res += '0';
            }
            n = n / 2;
        }
        String ans = new StringBuilder(res).reverse().toString();
        System.out.println(ans);
    }
}