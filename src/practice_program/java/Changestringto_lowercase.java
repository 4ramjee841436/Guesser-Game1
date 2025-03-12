package practice_program.java;
import java.util.Scanner;
public class Changestringto_lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();

        // problem:01
        //CONVERT UPPER CASE TO LOWER CASE
//        String Name=name.toLowerCase();
//        System.out.println(Name);

        // problem:02
        // CONVERT LOWER CASE TO UPPER CASE
//        String Name=name.toUpperCase();
//      System.out.println(Name);

        // problem:03
       // CHANGE THE SPACE WITH UNDERSCORE
//        String text="My Name is Ramjee";
//         text = text.replace(" ","_" );
//        System.out.println(text);

        // problem:04
    //CONVERT  <|Name|> TO THE ANY NAME:
//        String letter="Dear <|Name|>, thanks a lot";
//        letter= letter.replace("<|Name|>","Ramjee");
//        System.out.println(letter);

        // problem:05
        // to check double and triple space
        String xyz="this contains  double and   triple spaces";
        System.out.println(xyz.indexOf("  "));
        System.out.println(xyz.indexOf("   "));
        }
}
