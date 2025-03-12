import java.util.Scanner;
// take a digit an count the number of digits
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int numofDigits=0;
        int originalnumber=num;
        while(num>0)
        {
            num=num/10;
            numofDigits++;
        }
        System.out.println("Number of digits in "+originalnumber +" = " +numofDigits);
    }
}
