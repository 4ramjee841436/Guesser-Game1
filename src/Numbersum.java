import java.util.Scanner;
// sum of digit;
public class Numbersum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,s;
        System.out.println("enter a number");
        int num=sc.nextInt();
        while(num!=0)
        {
            s=num%10;
            sum=sum+s;
            num=num/10;
        }
        System.out.println("sum of digit is: "+sum);
    }
}
