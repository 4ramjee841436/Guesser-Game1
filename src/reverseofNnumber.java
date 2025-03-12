import java.util.Scanner;
// reverse of n numbers;
public class reverseofNnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int n=sc.nextInt();
        for(int num=n; num>=1; num--)
        {
            System.out.println(num);
        }
    }
}
