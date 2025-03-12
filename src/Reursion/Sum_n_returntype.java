package Reursion;
import java.util.Scanner;
public class Sum_n_returntype {
    public static int sum(int n)
    {
        if(n==0)
            return 0;
        int ans= n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :: ");
        int n= sc.nextInt();
        System.out.println("Summetion of "  + n+ " is :: " +sum(n));
    }
}
