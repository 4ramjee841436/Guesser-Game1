package Self_Practice;
import java.util.Scanner;
public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        int count =0;
        System.out.println("Enter Array Element : ");
        for(int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n-1;i++) {
            for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j])
                        count++;
                }
            }

        System.out.println("Total Inversion count in this Array is : "+count);
    }
}
