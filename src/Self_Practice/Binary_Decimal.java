package Self_Practice;
import java.util.Scanner;
public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Binary Number : ");
       String s= sc.next();
       int n= s.length();
       int digit=0;
       int pw=0;
       for(int i=n-1;i>=0;i--)
       {
          digit +=  i*pw;
          pw*=2;
       }
        System.out.println("Digit number is :"+digit);
    }
}
