package Reursion;
import java.util.Scanner;
public class Sum_1to_n {
    public static void add(int n, int s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        add(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :: ");
        int n= sc.nextInt();
        add(n,0);
    }
}
