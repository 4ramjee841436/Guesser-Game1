package Self_Practice;

public class NextGreatestElement {
    public static void main(String[] args) {
        int [] arr= {12,23,45,56,78,23,12,55};
        int n= arr.length;
        int [] ans= new int[n];
        ans[n-1]=-1;
        for(int i=0;i<n-1;i++)
        {
            int max= Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++)
            {
               max= Math.max(max,arr[j]);
            }
            ans[i]= max;
        }
//         --->>> (( METHOD 2)) <<<---

//        int lastgreatest= n-2;
//        for(int i=n-2;i>=0;i++)
//        {
//            ans[i]= lastgreatest;
//            lastgreatest= Math.max(lastgreatest,arr[i]);
//        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
