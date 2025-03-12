import java.util.Scanner;
// change the decimal number to its binary
public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Decimal number");
        int Dec_num=sc.nextInt();
        int result=0;// for converting in binary number
        int pw=1;// 10^0
        while(Dec_num>0)
        {
            int parity=Dec_num%2;
            result+=(parity*pw);
            pw*=10;
            Dec_num/=2;

        }
        System.out.println("The binary number is:"+result);
    }
}
