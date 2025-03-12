import java.util.Scanner;
public class Sum_of_Exponential {

        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number which is print:");
            int n=sc.nextInt();
            float sum=0;
            for(int i=0;i<=n;i++)
            {
                int fact=1;
                for(int j=1;j<=i;j++){
                    fact=fact*j;
                }
                sum=sum+(float)1/fact;
            }
            System.out.print(sum);
        }
    }

