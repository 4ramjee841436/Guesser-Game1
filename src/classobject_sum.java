import java.util.Scanner;
public class classobject_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first numbers");
        int a=sc.nextInt();
        System.out.println("Enter the second numbers");
        int b=sc.nextInt();

        findclassobject_sum(a,b);
    }
    public static void findclassobject_sum(int a,int b)
    {
        int sum;
        sum=a+b;
        System.out.println("sum of the number is: "+sum);
    }
}
