package practice_program.java;
import java.util.Scanner;
public class Prime1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a mumber: ");
        int n=Sc.nextInt();
        int c= 0;
        for(int i= 2; i<=n; i++) {
            if (n % i == 0)
                c++;
        }
            if(c==2)
                System.out.println("it is a prime number:");
else
                System.out.println("it is not a prime number:");

    }
}
