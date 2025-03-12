package Sorting_Algorithm;

import java.util.Arrays;

import static java.lang.Math.min;

public class LowerBound_Binary {
    public static void main(String[] args) {
        int[] arr= {10,56,8,55,99,108};
        int n= arr.length;
        int LB=n;
        int low=0;
        int high= n-1;
        Arrays.sort(arr);
        int target= 120;
        while(low<=high)
        {
            int mid= low+(high-low)/2;
            if(arr[mid]>=target)
            {
                 LB= min(LB, mid);
                high= mid-1;
            }
            else {
                low= mid+1;
            }
        }
        System.out.println("Lower bound of "+target+ " is : "+LB);
    }
}
