package PW_COURSE.java;
import java.util.Scanner;
public class UpdateEvenPosition {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an input: ");
        String S= sc.nextLine();
        String a=" ";
        for(int i=0;i<=S.length();i++)
        {
            if(i%2==0)
               a+='a';
            else
                a+=S.charAt(i);

        }
        System.out.println(a);
    }
}
