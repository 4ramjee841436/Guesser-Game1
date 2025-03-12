import java.util.Scanner;
// convert the hexadecimal number to its binary
public class Hexatobinary{
    public class OctaltoBinary {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a Hexadecimal number");
            int Hexadec_num=sc.nextInt();
            int result=0;// for converting in binary number
            int pw=1;// 10^0
            while(Hexadec_num>0)
            {
                int parity=Hexadec_num%16;
                result+=(parity*pw);
                pw*=10;
                Hexadec_num/=16;

            }
            System.out.println("The binary number is:"+result);
        }
    }
}
