package Self_Practice;
import java.util.Scanner;
public class Max_Number_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array Elements : ");
        int max=arr[0];
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }
        }
        System.out.println("Maximum number is  "+max);
    }
}
