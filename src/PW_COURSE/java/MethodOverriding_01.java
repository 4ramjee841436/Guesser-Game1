package PW_COURSE.java;
class parent1
{
    public  static void method1(int... i)
{
    System.out.println("This is parent class: ");
}
}
class child1 extends parent1
{
    public static void method1(int... i)
    {
        System.out.println("This is Child class :");
    }
}
public class MethodOverriding_01 {
    public static void main(String[] args) {
        parent1 p= new parent1();
        p.method1();
        child1 c= new child1();
        c.method1();
        parent1 p1= new parent1();
        p1.method1();
    }
}
