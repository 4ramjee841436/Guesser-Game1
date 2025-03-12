package Reursion;
import java.util.Scanner;
public class Print_increasing_decreasing {
    public static void value(int n)
    {
        if(n==0)
            return;
        System.out.println(n);//  for Decreasing
        value(n-1);// call
        System.out.println(n);// for increasing
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n :: ");
        int n= sc.nextInt();
        value(n);
    }
}
