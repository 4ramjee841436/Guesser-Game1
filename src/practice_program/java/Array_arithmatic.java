package practice_program.java;
import java.util.Scanner;
public class Array_arithmatic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]= new int[8];
        int sum=0;
//        int Difference=0;
//        int Multiplication=0;
//        int Division=1;
        System.out.println("Enter the elements in the Array: ");
        for(int i=0;i<8;i++)
         a[i]=sc.nextInt();
        for(int j=0;j<8;j++)
        {
            sum+= sum+a[j];
            System.out.println(sum);
//            Difference-=Difference-a[j];
//            System.out.println(Difference);
//            Multiplication*=Multiplication*a[j];
//            System.out.println(Multiplication);
//            Division/=Division/a[j];
//            System.out.println(Division);

        }
    }
}
