package practice_program.java;
import java.util.Scanner;
// check a year is leap or not
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();
        if(year%400==0 && year%4==0)
            System.out.println("it is a leap year");
        else
            System.out.println("it is not a laeap yaer");

    }
}
