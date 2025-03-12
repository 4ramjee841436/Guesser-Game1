package Self_Practice;
import java.util.Scanner;
public class Check_ArraySort {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length of an Array : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        int count =0;
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0; i<n-1;i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
        }
        if(count==n-1)
        {
            System.out.println("Element is sorted");
        }
        else {
            System.out.println("Element is not sorted");
        }
    }
}
