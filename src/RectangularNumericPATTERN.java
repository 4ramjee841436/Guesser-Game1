import java.util.Scanner;
// print the numeric Rectanguler pattern
public class RectangularNumericPATTERN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row");
        int r=sc.nextInt();
        System.out.println("enter the number of column");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }


}
