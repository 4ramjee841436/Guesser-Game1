package practice_program.java;
import java.util.Scanner;
public class Area_rectanglemethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breath of a rectangle:");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        float A=area(l,b);
        System.out.println("Area of rectangle is:"+A);
    }
    public static float area(float l,float b)
    {
        return l*b;
    }
}
