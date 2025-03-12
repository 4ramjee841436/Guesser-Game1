package Sorting_Algorithm;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        int temp;
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {

                if(arr[j]<arr[j-1]){
                    temp= arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
}
