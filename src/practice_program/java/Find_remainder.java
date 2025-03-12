package practice_program.java;
import java.util.Scanner;
public class Find_remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend");
        int a=sc.nextInt();
        System.out.println("Enter the divisor");
        int b=sc.nextInt();
        System.out.println("Enter the quotient");
        int q=sc.nextInt();
        int r=a-(b*q);
        System.out.println("The remainder is:"+r);
    }
}
