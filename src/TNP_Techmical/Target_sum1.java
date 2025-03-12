package TNP_Techmical;

import java.util.Arrays;
public class Target_sum1 {
    static boolean twoSum( int[]arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while(left<right)
        {
        int sum = arr[left] + arr[right];
        if (sum == target)
            return true;
        else if (sum < target)
            left++;
        else
            right--;
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr={12,-8,10,5,14,-21};
        int target= -11;
        int n= arr.length;
        if(twoSum(arr,target))
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
