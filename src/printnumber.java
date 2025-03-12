import java.util.Scanner;
// print the natural number 1 to n;
public class printnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int num=1;
        while(num<=n)
        {
            System.out.println(" "+num);
            num++;
        }
    }
}
