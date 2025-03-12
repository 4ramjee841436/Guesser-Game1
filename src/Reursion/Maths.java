package Reursion;
import java.util.Scanner;
public class Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,53,54,45,24};
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <35)
            {
                System.out.println("The Roll number of the student is :"+i+"");
            }

        }
    }

}

