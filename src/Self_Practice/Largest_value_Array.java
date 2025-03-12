package Self_Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Largest_value_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            Arrays.sort(arr);
        System.out.println("Maximum Array element is : "+arr[n]);
        }
    }

