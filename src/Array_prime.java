import java.util.Scanner;
// To input an array with 10 values and check how many prime number present in array
public class Array_prime
{  public static void main(String[] args)
{     Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i;
        int prime = 0;
        System.out.println("Enter the elements in array:");
        for (i = 0; i < 10; i++)
            a[i] = sc.nextInt();
        for (i = 0; i < 10; i++)
        {  int count =0;
            for (int k = 1; k <= a[i]; k++)
            {     if (a[i] % k == 0)
                     count++;
            }

           if (count == 2)
               prime++;
        }
                System.out.println("The no  of prime number in array is " +prime);
    }
}
