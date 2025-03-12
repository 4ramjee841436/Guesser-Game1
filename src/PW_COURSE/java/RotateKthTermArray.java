package PW_COURSE.java;

public class RotateKthTermArray {
    public  static void reverse(int []arr,int i,int j)
    {
        while(i<=j)
        {
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50,60,74,64};
        int k= 4;
        int n= arr.length;
        k= k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
