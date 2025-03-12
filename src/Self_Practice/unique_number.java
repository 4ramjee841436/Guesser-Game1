package Self_Practice;
import java.util.Scanner;
public class unique_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of an array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int single=0;
        for (int i=0;i<n;i++) {
            single ^= arr[i];
        }
        System.out.println("Unique element is :  "+single);
    }
}