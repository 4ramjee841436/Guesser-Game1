import java.util.Scanner;
        // print a numeric pattern 1234567;
//                                 2345671;
//                                 3456712;
public class NumericPattern {
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter a number");
                int r=sc.nextInt();
                for(int i=1;i<=r;i++)
                {
                    for(int j=i;j<=r;j++)
                    {
                        System.out.print(j);
                    }
                    for(int k=1;k<=i-1;k++)
                    {
                        System.out.print(k);
                    }
                    System.out.println();
                }

            }
}
