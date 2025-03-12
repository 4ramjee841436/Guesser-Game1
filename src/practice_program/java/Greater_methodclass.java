package practice_program.java;
import java.util.Scanner;
public class Greater_methodclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int G=greatest(n1,n2);
        System.out.println("The greatest number is:"+G);
    }
    public static int greatest(int n1,int n2)
    {
     if(n1>n2)
         return n1;
     else
         return n2;
    }
}
