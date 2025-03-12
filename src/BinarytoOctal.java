import java.util.Scanner;
// convert the binary number in its octal
public class BinarytoOctal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a binary number");
        int Bin_num=sc.nextInt();
        int result=0;//for convert in decimal
        int pw=1;//for 8^0
        while(Bin_num>0)
        {
            int unit_digit=Bin_num%10;
            result+=(unit_digit*pw);
            Bin_num/=10;
            pw*= 8;
        }
        System.out.println("The octal number is: "+result);
    }
}


