package TwoDimensional.java;

import java.util.Scanner;

public class User_Input_TwoDimensional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row Size: ");
        int n= sc.nextInt();
        System.out.println("Enter colns Size: ");
        int m= sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
  }
//         for each loop :->>>>

       for(int[]ele: arr)
        {
            for(int x:ele)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }


    }
}
