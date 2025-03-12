package Self_Practice;
import java.util.Scanner;
public class ArithmaticProgresssion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term : ");
        int n= sc.nextInt();
//        pateern:-> 1,3,5,7,9,11..........
//        an= a+(n-1)d -> 1+(n-1)2= 2n-1

        for(int i=1;i<=2*n-1;i+=2)
        {
            System.out.println(i);
        }
    }
}
