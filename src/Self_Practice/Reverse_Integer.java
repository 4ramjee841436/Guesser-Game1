package Self_Practice;
import java.util.Scanner;
public class Reverse_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int n= sc.nextInt();

        int reversedNum=0;
        while(n!=0)
        {
           int digit= n%10;
            reversedNum= reversedNum * 10+ digit;
            n/=10;
        }
        System.out.println("Reversed Integer is : "+reversedNum);
    }
}
