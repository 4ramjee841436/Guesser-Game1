package Sorting_Algorithm;

import java.util.Arrays;

public class UpperBound_Binary {
    public static void main(String[] args) {
        int [] arr= {10,23,55,24,56,98,99,120};
        int n= arr.length;
        int UB=n;
        int low= 0;
        int high=n-1;
        int target= 125;
        Arrays.sort(arr);
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                UB = Math.max(UB, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
            System.out.println("Upper bound of " +target+" is : "+UB);

    }
}
