import java.util.*;
public class Sorted_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[12];
        System.out.println("Enter the elements in the array:");
        int arr=sc.nextInt();
        for(int i=0;i<=12;i++)
        {
            for(int j=0;j<11-i;j++)
            {
                if((j)>(j+1))
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0;i<=12;i++){
            System.out.println("After sorting the array is:"+a[i]);

        }
    }
}
