import java.util.Scanner;
public class matrix_addition {
    // Addition of two matrices
        public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            int m,n;
            System.out.print("Enter row:");
            m=sc.nextInt();
            System.out.print("Enter column:");
            n=sc.nextInt();
            int a[][]=new int[m][n];
            int b[][]=new int[m][n];
            int c[][]  = new int[m][n];
            System.out.println(" Enter"+m*n+" elements of Array:");
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=n;j++)

                    a[i][j]=sc.nextInt();
                }
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=n;j++)

                    b[i][j]=sc.nextInt();
            }
            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=n;j++)
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.println("The addition of matrix is: ");
                }
                    for(int i=1;i<=m;i++)
                    {
                        for(int j=1;j<=n;j++)

                            System.out.println(c[i][j]+" ");
                    }
                }
            }



