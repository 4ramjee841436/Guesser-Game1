package Reursion;
import java.util.Scanner;
public class Factorial {
    public static int fact(int n)
    {
        if(n==1)
            return 1;
       int reuslt=n* fact(n-1);
        return reuslt;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n :: ");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" is::" +fact(n));
    }
}
