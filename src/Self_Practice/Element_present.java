package Self_Practice;
import java.util.Scanner;
public class Element_present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array length");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the Array Elements : ");
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key element");
        int m= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(m==arr[i])
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Key element found in array");
        }
        else {
            System.out.println("key element not found");
        }
    }
}
