import java.util.Scanner;
// convert the octal number to its binary number
public class OctaltoBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a octal number");
        int octal_num=sc.nextInt();
        int result=0;// for converting in binary number
        int pw=1;// 10^0
        while(octal_num>0)
        {
            int parity=octal_num%8;
            result+=(parity*pw);
            pw*=10;
            octal_num/=8;

        }
        System.out.println("The binary number is:"+result);
    }
}


