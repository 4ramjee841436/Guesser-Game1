package Sorting_Algorithm;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int []a= {12,15,23,45,76};
        int[] b= {21,32,42,44,54,90};
        int n= a.length;
        int m= b.length;
        int [] c= new int[n+m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(a[i]<b[j])
                        c[k++] = a[i++];


                    else
                        c[k++] = b[j++];
                }
            }
        }
        for(int ele: c)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
