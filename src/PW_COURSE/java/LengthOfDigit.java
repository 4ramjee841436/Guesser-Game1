package PW_COURSE.java;
import java.util.Scanner;
public class LengthOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Digit:");
        int n= sc.nextInt();
        System.out.println("After convert into the String & length of : " +Integer.toString(n).length());
    }
}
