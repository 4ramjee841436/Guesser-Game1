package Reursion;
import java.util.Scanner;
public class Stairs {
    public static int stairs(int n)
    {
        if(n<=3) return n;
        return stairs(n-1)+stairs(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n= sc.nextInt();
        System.out.println(stairs(n));
    }
}
