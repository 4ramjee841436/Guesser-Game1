package TwoDimensional.java;

import java.util.Scanner;

public class UserInput_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Matrix rows number : ");
        int m= sc.nextInt();
        System.out.println("Enter 1st Matrix colns number : ");
        int n= sc.nextInt();
        int[][] arr= new int[m][n];
        System.out.println("Enter 1st Matrix Element : ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 arr [i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter 2nd Matrix rows number : ");
        int p= sc.nextInt();
        System.out.println("Enter 2nd Matrix colns number : ");
        int q= sc.nextInt();
        int[][] brr= new int[p][q];
        System.out.println("Enter 2nd Matrix Element : ");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                brr [i][j]= sc.nextInt();
            }
        }
        if(arr[0].length != brr.length)
        {
            System.out.println("Multiplication is not possible please check it !! ");
        }
        else {
            int [][] c= new int[arr.length][brr[0].length];
            for(int i=0;i<c.length;i++)
            {
                for(int j=0;j<c[0].length;j++)
                {
                    // a[i][0]*b[0][j]+a[i][1]*b[1][j]+ a[i][2]*b[2]b[j]+.........
                    for(int k=0;k<brr.length;k++)
                    {
                        c[i][j]+= arr[i][k]*brr[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();

            }

        }
    }
}
