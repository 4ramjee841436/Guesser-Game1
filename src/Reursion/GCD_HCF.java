package Reursion;
import java.util.Scanner;
public class GCD_HCF {
    public  static int gcd(int a,int b)
    {
        if (b % a == 0)
        {
         return a;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= sc.nextInt();
        System.out.println("Enter b :");
        int b= sc.nextInt();
        System.out.println("Gcd of "+a+ " and "+b+" is :"+gcd(a,b));
    }
}
