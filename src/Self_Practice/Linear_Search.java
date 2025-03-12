package Self_Practice;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array Elements : ");

        for(int i=0;i<n;i++)
        {
          arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Element which you have searched : ");
        int x= sc.nextInt();
        for (int i=0;i<n;i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found !!");
    }
}
