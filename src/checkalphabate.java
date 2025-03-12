import java.util.Scanner;
// check a character and check it is alphabate or not
public class checkalphabate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        char p= sc.next().charAt(0);
        if(p>64 || p<91)
        {
            System.out.println("it is an alphabate");
        }
        else if(p>98 || p<123)
        {
            System.out.println("it is an alphabate");
        }
        else {
            System.out.println("it is not an alphabate");
        }

    }
}
