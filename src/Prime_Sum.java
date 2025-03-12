import java.util.Scanner;
public class Prime_Sum {
    public static boolean is_prime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i ==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        int sum=0;
        for(int i=2;i<n;i++)
        {
            if(is_prime(i))
            {
                sum+=i;
            }
        }
        System.out.println("Sum of "+n+" prime number is : "+sum);
    }
}
