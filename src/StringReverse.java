import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String rev = reverse(s);
        System.out.println("Reverse String of " + s + " is : " + rev);
    }

    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}

