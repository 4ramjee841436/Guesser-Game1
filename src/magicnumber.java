import java.util.Scanner;

public class magicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, rem = 0;
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        int a = num;
        while (num > 9) {
            rem = 0;
            while (num != 0) {
                s = num % 10;
                rem = rem + s;
                num = num / 10;
            }
            num = rem;
        }
        if (rem == 1) {
            System.out.println(a + " is a magic number.");
        } else {
            System.out.println(a + " is not a magic number.");
        }
    }
}

