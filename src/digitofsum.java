import java.util.Scanner;
// sum of digits
public class digitofsum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int i=1;
        System.out.println("enter the digits");
        int num=sc.nextInt();
    while(num!=0)
    {
        sum+= num%10;
        num = num/10;
    }
        System.out.println("sum of digit is:"+sum);
    }
}
