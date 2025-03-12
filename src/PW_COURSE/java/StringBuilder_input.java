package PW_COURSE.java;
import java.util.Scanner;
public class StringBuilder_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String s=sc.next();
        StringBuilder sb= new StringBuilder(sc.nextLine());// or new StringBuilder(S)
        System.out.println("Enter your second String: ");
        String s2= sc.nextLine();
        StringBuilder sb1=new StringBuilder(s2);
        System.out.println(sb.compareTo(sb1));
    }
}
