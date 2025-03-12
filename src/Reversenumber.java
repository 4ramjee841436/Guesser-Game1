import java.util.Scanner;
// Reverse of numbers
public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reverse=0;
        System.out.println("enter a number");
        int num=sc.nextInt();
        while(num>0)
        {
           reverse=reverse*10+num%10;
           num=num/10;
        }
        System.out.println("Reverse number is:"+reverse);
    }
}
