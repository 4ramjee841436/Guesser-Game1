package practice_program.java;
import java.util.Scanner;

public class Area_ofcirclemethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r=sc.nextFloat();
        float pie;
        float A=area(r);
        System.out.println("Area of circle is:"+A);
    }
    public static float area(float r)
    {
        float pie=3.14f;
        return  pie*r*r;
    }
}
