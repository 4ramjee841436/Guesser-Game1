package PW_COURSE.java;
import java.util.Scanner;
abstract class shape
{
    public float area;
    //abstract method
    public abstract void input();
    public abstract void calcArea();

    //concrete methods
    public void disp()
    {
        System.out.println("Area is :: "+area);
    }
}
class square extends shape
{
    private float length;
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Square :: ");
        length = sc.nextFloat();
    }
    public void calcArea()
    {
        area = length*length;
    }

}
class rectangle extends  shape {
    private float length;
    private float breadth;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectanglec :: ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of Rectanglec :: ");
        breadth = sc.nextFloat();
    }
@Override
        public void calcArea()
        {
            area= length*breadth;
        }
    }
    class Circle extends shape
    {
        private float radius;
        @Override
        public void input()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the radius of circle :: ");
            radius=sc.nextFloat();
        }
        @Override
        public void calcArea()
        {
            area= 3.1414f * radius * radius;
        }
    }
public class Abstract_class {
    public static void main(String[] args) {
        shape s;
        // working with Squqre object
        s=new square();
        s.input();
        s.calcArea();
        s.disp();
        System.out.println();

        // working with rectangle object
        s= new rectangle();
        s.input();
        s.calcArea();
        s.disp();
        System.out.println();

        // working with Circle object
        s=new Circle();
        s.input();
        s.calcArea();
        s.disp();
        System.out.println();
    }
}