package PW_COURSE.java;
import java.util.Scanner;
public class ConvertIntToString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
          int n= sc.nextInt();
          String S=" "+ n;
        System.out.println("After convert the String is: "+S);
        System.out.println(S + " is of type " + S.getClass().getSimpleName());

    }
}
