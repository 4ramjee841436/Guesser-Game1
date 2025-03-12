import java.util.Scanner;
//
public class Array_shorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i,j;
        int temp;
        System.out.println("Enter the elements in array");
        for (j= 0; j< 10; j++)
            a[j] = sc.nextInt();
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if (a[j] > a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }

            }
        }
        for (i = 0; i < 10; i++)
            System.out.println("After shorting the elements is: "+a[i]);
    }
}
