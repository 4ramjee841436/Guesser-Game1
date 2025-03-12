import java.util.Scanner;
// given two numbers a and b.find a raise to the power of b;
public class powerOFtwonumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int power=1;
        System.out.println("enter the first number ");
        int a=sc.nextInt();
        System.out.println("enter the second number ");
                int b=sc.nextInt();
                for(int i=1;i<=b;i++)
                {
                    power*=a;
                }
        System.out.println("power of number is: " +power);
    }
}
