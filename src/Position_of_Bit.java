import java.util.Scanner;
public class Position_of_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter the position of a bits");
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        if((bitmask & n)==0)
        {
            System.out.println("Bit is a zero :");
        }
        else
        {
            System.out.println("Bit is one");
        }
    }
}
