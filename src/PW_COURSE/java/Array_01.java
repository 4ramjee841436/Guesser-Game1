package PW_COURSE.java;

public class Array_01 {
    public static void main(String[] args) {


       int[] a = null;
        System.out.println(a);
        a= new int[5];
        System.out.println("Before initialization: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
            a[0]=10;
            a[1]=20;
            a[2]=30;
            a[3]=40;
            a[4]=50;
            System.out.println("After initialization: ");
            for( int i=0;i<5;i++)
            {
                System.out.println(a[i]);
            }
        }

    }
