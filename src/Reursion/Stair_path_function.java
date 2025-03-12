package Reursion;
import java.util.Scanner;
public class Stair_path_function {
    public static int stair(int n)
    {
        if(n<=2)
            return n;
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int n= sc.nextInt();
        System.out.println("The no ways to clambing a stair is ---> " +stair(n));
    }
}
