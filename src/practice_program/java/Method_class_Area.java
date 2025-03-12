package practice_program.java;
import java.util.Scanner;
public class Method_class_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breath of rectangle:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int A=Area(l,b);
        System.out.println("Area of rectangle is: "+A);
        System.out.println("Enter the radius of circle:");
        float r=sc.nextInt();
        float Ar=Area(r);
        System.out.println("Area of circle is: "+Ar);
        System.out.println("Enter the three sides of triangle: ");
        int a=sc.nextInt();
        int br=sc.nextInt();
        int c=sc.nextInt();
        double area=Area(a,br,c);
        System.out.println("Area of triangle is : "+area);
    }
    public static int Area(int l,int b)
    {
        return  l*b;
    }
    public static float Area(float r)
    {
        float pie=3.14f;
        return  pie*r*r;
    }
    public static double Area(int a,int br,int c) {
        int s=(a+br+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-br)*(s-c));
        return area;

    }
}
