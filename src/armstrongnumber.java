import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0;
        int i=1;
         i=num;

        while(num>0)
        {
            int n=num%10;
            num=num/10;
           sum=sum+(n*n*n*n);
        }
        if(sum==i)
        {
            System.out.println("it is armstong number");
        }
        else {
            System.out.println("it is not armstrong number");
        }

    }
}
