package Sorting_Algorithm;

public class Peak_MountainArray {
    public static void main (String[]args){
        int[] arr = {10, 20, 30, 50, 30, 40, 20};
        int n= arr.length;
        int low= 1;
        int high= n-1;
        while (low<=high)
        {
            int mid= low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                System.out.println("Peak element is at : "+ mid);
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low= mid+1;
                System.out.println("Array element is at : "+low);
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
            {

            }
        }

    }
}
