import java.util.Scanner;
// to print the pyramid pattern ****;
public class Pyramidpattern {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int r=sc.nextInt();
            for(int i=0;i<=r;i++)
            {
                // for print the (r-i)space
                for(int j=1;j<=r-i;j++){
                    System.out.print(" ");
                }
                // for print the * (2*i-1)
                for(int k=1;k<=2*i-1;k++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
    }
}
