package PW_COURSE.java;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] arr={10,20,30,45,65,23,67};
        int n= arr.length;
        for(int ele: arr)
        {
            System.out.print( ele+" ");// before reversing
        }
        System.out.println();
//        for(int i=0;i<n/2;i++)
//        {
//            int j= n-1-i;
//             int temp=arr[i];
//            arr[i]= arr[j];
//            arr[j]=temp;
//        }

        // 2nd method

        int i=0,j=n-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr)
        {
            System.out.print( ele+" ");  // after reversing
        }
    }
}
