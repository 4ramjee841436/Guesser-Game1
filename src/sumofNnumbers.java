import java.util.Scanner;
// sum of n numbers;
public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=1;
        int sum=0;
        while(num<=n)
        {
            sum=sum+num;
            num++;
        }
        System.out.println(" "+sum);
    }
}
