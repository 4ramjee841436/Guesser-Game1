import java.util.Scanner;
// exchange of two numbers
public class Exchangenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("enter the first number");
        int num_1=sc.nextInt();
        System.out.println("enter the second number");
        int num_2=sc.nextInt();
        temp=num_1;
        num_1=num_2;
        num_2=temp;
        System.out.println("num_1 is " +num_1);
        System.out.println("num_2 is " +num_2);
    }
}
