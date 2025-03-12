package TNP_Techmical;

import java.util.Scanner;

public class NumberOccurance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int []nums= new int[n];
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            nums[i]= sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(nums[i]== nums[j]) {
                    count1 = nums[1];


                }
            }

        }
        System.out.println(count1);
    }
}
