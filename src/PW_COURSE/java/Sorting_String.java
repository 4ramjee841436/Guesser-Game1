package PW_COURSE.java;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        char[] ch= s.toCharArray();
        for(char element:ch)
        {
            System.out.print(element);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char element:ch)
        {
            System.out.print(element);
        }
        System.out.println();
    }
}
