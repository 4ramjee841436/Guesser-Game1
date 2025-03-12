package practice_program.java;
import java.util.Scanner;
// to input a number and find its absolute value
public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num<0)
        num=num*-1;
        System.out.println("The absolute value is:"+num);
    }
}
