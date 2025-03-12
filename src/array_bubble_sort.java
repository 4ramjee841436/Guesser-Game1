import java.util.Scanner;
// TO input an array with 10 value nad check a seprate x is present in array or not
public class array_bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i;
        int count= 0;
        System.out.println("Enter the elements in array");
        for (i= 0; i< 10; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the number which is searching in array:");
        int item=sc.nextInt();
        for(i=0;i<10;i++) {
            if (item == a[i])
                count++;

        }
            if(count>0)

                System.out.println("The item is  present in array ");

            else

                System.out.println("The item is not present in array ");
        }
    }

