package Self_Practice;

public class MergeTwoSortedArrays {
    public static void print(int[]arr)
    {
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[]a,int[]b,int[]c)
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
                c[k++]=a[i++];
//                i++;
//                k++;
            else
                c[k++]=b[j++];
//                j++;
//                k++;
        }
        if(i==a.length) {
            while (j < b.length)
                c[k++] = b[j++];
        }

        else {
            if(j==b.length) {
                while (i < a.length)
                    c[k++] = a[i++];
            }
        }
    }
    public static void main(String[] args) {
        int[]a ={25,30,45,55, 60,75};
        int []b= {8,23,30,40};
        print(a);
        print(b);
        int[] c= new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
