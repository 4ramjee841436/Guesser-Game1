package Sorting_Algorithm;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int [] arr= { 2,1,0,1,2,0,1,2,0,0,1,1,2,0};
        int n= arr.length;
        int NofZero=0,NofOne=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]== 0)
                NofZero++;
            if(arr[i]==1)
                NofOne++;
        }
        for(int i=0;i<n;i++)
        {
            if(i<NofZero)
                arr[i]=0;
           else if(i<NofZero+NofOne)
                arr[i]=1;
            else
                arr[i]=2;
        }
        for(int ele: arr)
        {
            System.out.print(ele+ " ");
        }
    }
}
