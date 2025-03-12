import java.util.Scanner;
// find Gcd of two integers;
public class gcdofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gcd=1;
        System.out.println("enter the first number");
        int num_1=sc.nextInt();
        System.out.println("enter the second number");
        int num_2=sc.nextInt();
        for(int i=1; i<=num_1 && i<=num_2;++i)
        {
            if(num_1%i==0 && num_2%i==0)
                gcd=i;
                System.out.println("gcd of  "+num_1 +" and "+num_2+ " is  "+ gcd);
        }
    }
}
