import java.util.Scanner;
// change the binary numner into the decimal number
public class binarytoDecimal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a binary number");
        int Bin_num=sc.nextInt();
        int result=0;//for convert in decimal
        int pw=1;//for 2^0
        while(Bin_num>0)
        {
            int unit_digit=Bin_num%10;
            result+=(unit_digit*pw);
            Bin_num/=10;
            pw*= 2;
        }
        System.out.println("The Decimal number is: "+result);
    }
}
