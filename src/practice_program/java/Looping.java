package practice_program.java;

public class Looping {
    public static void main(String[] args) {
//
//        int [][] arr= {{2,3},{4,5},{6,7}};
        int [] arr={1,5,3,-10,34};

//        linear search

//        int x=5;
//        boolean flag= false;
//        for(int i=0;i<arr.length;i++)
//        {
//          if(arr[i]== x)
//              flag= true;
//        }
//       if(flag)
//           System.out.println("element is present ");
//       else
//           System.out.println("element is  not present ");
     int mx=0;
        for (int i = 0; i <arr.length ; i++) {


            mx = Math.max(mx,arr[i]);
        }
        System.out.println("Maximum value is :"+mx);
    }
}
