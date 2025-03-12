package practice_program.java;
import java.util.Scanner;
public class Last_Index_Occurance {
    static int LastOccurance(int arr[], int x) {
        int Lastindex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                Lastindex = i;
            }
        }
        return Lastindex;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter size of array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter "+n+" elements");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the Number which is count:");
            int x=sc.nextInt();
            System.out.println("Occurance of the Number is:"+LastOccurance  (arr,x));
    }
}