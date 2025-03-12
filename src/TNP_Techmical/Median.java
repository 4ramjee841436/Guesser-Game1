package TNP_Techmical;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []nums= new int[n];
        int median=0;
        for(int i=0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        }
        Arrays.sort(nums);
            median = nums[n / 2];
        System.out.println(median);
    }
}
