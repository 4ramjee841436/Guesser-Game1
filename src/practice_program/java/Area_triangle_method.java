package practice_program.java;
import java.util.Scanner;
// to find the Area of triangle given three sides of triangle by using method class
public class Area_triangle_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double A=area(a,b,c);
        System.out.println("Area of triangle is: "+A);
    }
    public static double area (int a,int b,int c)
    {
        int s=(a+b+c)/2;
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return A;

    }
}
