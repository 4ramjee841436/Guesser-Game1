package Reursion;
import java.util.Scanner;
public class Power_Aand_b {
    public static int pow(int a,int b)
    {
        if(a==0 && b==0)
        {
            System.out.println("it is invalid satatement ::");
            return -1;
        }
        if(b==0)
            return 1;
        int ans= a*pow(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value :: ");
        int a= sc.nextInt();
        System.out.println("Enter power :: ");
        int b= sc.nextInt();
        System.out.println(a+" to the power "+b+"  is ::"+pow(a,b));
    }
}
