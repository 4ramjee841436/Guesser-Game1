package TwoDimensional.java;

import java.util.Scanner;

public class Min_inTwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;
        int sum=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                min = Math.min(min, arr[i][j]);
                sum+=arr[i][j];

            }
        }
        System.out.println("Minimum Elements present in this Array is :  "+ min);
        System.out.println("Sum of this Array is :  "+ sum);
    }
}