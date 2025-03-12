import java.util.Scanner;
// check number is palindrome or not
public class Palindromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s,rem=0;
        System.out.println("enter a number");
        int num=sc.nextInt();
        int a=num;
        while(num!=0)
        {
            s=num%10;
            rem=rem*10+s;
            num=num/10;
        }
        if (a == rem) {

            System.out.println("it is a palindrome number");
        }
        else {
            System.out.println("it is not a palindrome number");
        }
        }
}
