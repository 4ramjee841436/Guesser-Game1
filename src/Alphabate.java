import java.util.Scanner;
//  input a charachter and check it is vowel or not?
public class Alphabate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
       char x = sc.nextLine().charAt(0);
        if(x=='a'||x=='A'|| x=='e'|| x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
        {
            System.out.println("it is vowel");

        }
        else
        {
            System.out.println("it is consonant");
        }

    }
}
