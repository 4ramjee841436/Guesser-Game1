package PW_COURSE.java;

public class Array_2D {
    public static void main(String[] args) {
        int[][] a= null;
        a=new int[2][];
        System.out.println(a);
        a[0]=new int[4];
        System.out.println(a[0]);
        a[1]=new int[3];
        System.out.println(a[1]);
        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][4]=20;

        a[1][0]=50;
        a[1][1]=60;
        a[1][2]=70;
    }
}
