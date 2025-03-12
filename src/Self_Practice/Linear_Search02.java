package Self_Practice;
import java.util.Scanner;
public class Linear_Search02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array  : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        int count = 0;
        System.out.println("Enter the Array Elements : ");
        for (int i=0; i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the Elements which you Searched : ");
        int m= sc.nextInt();
        for(int i =0; i<n;i++)
        {
            if(arr[i]==m){
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Element  found  Successfully   :: ");
        }
        else {
            System.out.println("Element not Found :: ");
        }

    }
}
