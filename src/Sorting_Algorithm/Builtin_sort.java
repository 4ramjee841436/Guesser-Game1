package Sorting_Algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class Builtin_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length : ");
        int n= sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
