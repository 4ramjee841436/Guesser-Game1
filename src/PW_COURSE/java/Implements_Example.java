package PW_COURSE.java;
interface IRight
{
    int x=888;
}
interface  ILeft
{
    int x=999;
}
interface  IUpper
{
    int x=555;
}
interface  ILower
{
    int y=666;
}
public class Implements_Example implements ILeft,IRight,IUpper {
    public static void main(String[] args) {
        System.out.println("Right Value is :: "+IRight.x);
        System.out.println("Left Value is  :: "+ILeft.x);
        System.out.println("Upper value is :: "+IUpper.x);
        System.out.println("Lower Value is :: "+ILower.y);
    }
}
