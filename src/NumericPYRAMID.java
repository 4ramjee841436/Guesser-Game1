import java.util.Scanner;
public class NumericPYRAMID {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int r=sc.nextInt();
        for(int i=0;i<=r;i++)
        {
            // for print the (r-i)space
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
                // for print the i to 1;
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                // print i-1 to 1
                for (int l= i - 1; l >= 1; l--) {
                    System.out.print(l);
                }
                System.out.println();
            }
    }
}

