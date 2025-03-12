package PW_COURSE.java;
import  java.util.Scanner;
//import StringBuilder;
public class StringBuilderIn_String {
    public static void main(String[] args) {
//StringBuilder sb=new StringBuilder();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first  String: ");
        String S1=sc.nextLine();
        System.out.println("Enter the second String: ");
        String S2=sc.nextLine();
        System.out.println(S1.compareTo(S2));
        System.out.println("The capacity of S1 is: "+S1.length());
        System.out.println("The capacity of S2 is: "+S2.length());

    }
}
