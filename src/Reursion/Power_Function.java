package Reursion;
import java.util.Scanner;
public class Power_Function {
    public static int pow(int a,int b)
    {
        if(b==0)
            return 1;
        if(b%2!=0)
        {
             int ans=pow(a,b/2);
             return ans*ans*a;
        }

        else
        {
            int ans=pow(a,b/2);
            return ans*ans;
        }

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a base --> ");
        int a= sc.nextInt();
        System.out.println("Enter the power ---> ");
        int b=sc.nextInt();
        System.out.println(a+" to the power "+b+" is -->> "+pow(a,b));
    }
}
