package Self_Practice;
import java.util.Scanner;
public class Sum_of_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of an array :");
        int n= sc.nextInt();
        int[]arr= new int[n];
        int sum=0;

            System.out.println("Enter the arrays : ");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();

                sum += arr[i];
            }
        System.out.println("The Sum of arrays are : "+sum);
        }
    }

