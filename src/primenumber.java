import java.util.Scanner;
// check the number is prime number or not;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=2;
        System.out.println("enter a number:");
        int num=sc.nextInt();
        boolean b= false;
        while(i<=num/2)
        {
            if(num%i==0)
            {
                b = true;
                break;
            }
            i++;
        }
        if (!b)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
         }
    }

