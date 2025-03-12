package PW_COURSE.java;
import java.util.Scanner;

public class Reversed_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        int [] revArr = new int[n];
        System.out.println("Enter the Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Original Array is : ");
        for(int ele: arr)
        {
            System.out.print( ele+" ");
        }
        System.out.println();
        for (int j= 0; j <n ; j++) {
            revArr[j]=arr[n-1-j];
        }
        System.out.println("Reversed Array is : ");
        for(int ele: revArr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}
