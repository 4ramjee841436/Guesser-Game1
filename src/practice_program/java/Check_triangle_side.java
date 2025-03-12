package practice_program.java;
import java.util.Scanner;
// to take three sides and chek it is side of triangle or not
public class Check_triangle_side {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        int a=sc.nextInt();
        System.out.println("Enter the second side of triangle");
        int b=sc.nextInt();
        System.out.println("Enter the third side of triangle");
        int c=sc.nextInt();
        if((a+b)>c){
            System.out.println("it is the side of triangle");
        }
else if((a+c)>b) {
            System.out.println("it is the side of triangle");
        }
else if((b+c)>a)
        {
            System.out.println("it is the side of triangle");
        }
else
            System.out.println("it is not side of triangle");
    }
}
