package Self_Practice;
import java.util.Scanner;
public class Product_Of_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the Array Elements : ");
        int prod=1;
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
            prod*= arr[i];
        }
        System.out.println("Product of array is : "+prod);
    }
}
