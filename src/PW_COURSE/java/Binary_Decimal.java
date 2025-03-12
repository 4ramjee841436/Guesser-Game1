package PW_COURSE.java;
import java.util.Scanner;
public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary number: ");
        String bin= sc.next();
        int n= bin.length();
        int pow2= 1;
        int num=0;
        for(int i=n-1;i>=0;i--)
        {
           {
                num=num+pow2;

            }
            pow2*=2;
        }
        System.out.println(num);
    }
}
