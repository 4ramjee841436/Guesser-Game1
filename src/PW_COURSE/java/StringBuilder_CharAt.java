package PW_COURSE.java;
import java.util.Scanner;
public class StringBuilder_CharAt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String input: ");
//        String S1= sc.nextLine();
        StringBuilder Sb= new StringBuilder(sc.nextLine());
        System.out.println(Sb);
        // individual element is putting in the  index position(CharAt())
        Sb.setCharAt(9,'a');
        System.out.println(Sb);

    }
}
