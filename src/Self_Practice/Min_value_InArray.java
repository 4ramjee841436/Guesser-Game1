package Self_Practice;
import java.util.Scanner;
public class Min_value_InArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Array length : ");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the Array Elements :");
        int min=arr[0];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min= arr[i];
            }
        }
        System.out.println("Minimum value in array is : "+min);
    }
}
