import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact;
        int p, sum = 0;
        int i;
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int s = n;

        while (n != 0) {
            i = 1;
            fact = 1;
            int digit = n % 10;

            // Calculate factorial of the current digit
            while (i <= digit) {
                fact = fact * i;
                i++;
            }
            sum = sum + fact;

            n = n / 10;
        }

        if (sum == s) {
            System.out.println(s + " is a strong number.");
        } else {
            System.out.println(s + " is not a strong number.");
        }
    }
}

