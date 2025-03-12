import java.util.Scanner;
// check the number is perfect or not;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int i=1;
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(i=1;i<num;i++) {
            if (num % i == 0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println("it is perfect number");
        }
        else {
            System.out.println("it is not a perfect number");
        }
    }
}
