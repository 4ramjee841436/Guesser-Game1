package Sorting_Algorithm;

public class Binary_search {

    public static void main(String[] args) {
        int [] arr= {10,-4,8,12,17,8,14};
        int n= arr.length;
        int low= 0;
        int high= n-1;
        int target= 12;
        while(low<=high)
        {
            int mid= low+(high-low)/2;
         if(arr[mid]== target)
         {
             System.out.println("Array found at : "+mid);
         }
         else if(arr[mid]> target)
         {
             high= mid-1;
             System.out.println("Array found at :"+ high);
         }
         else {
             low= mid-1;
             System.out.println("Array found at : "+ low);
         }
        }
        System.out.println("Please give the correct target Element : ");

    }
}
