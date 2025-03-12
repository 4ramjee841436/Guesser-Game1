package PW_COURSE.java;

public class Substring {
    public static void main(String[] args) {
        String  S ="abcdef";
        for(int i=0;i<S.length();i++)
        {
            for(int j=i+1;j<=5;j++)
            {
                System.out.print(S.substring(i,j)+" ");
            }
            System.out.println();
        }

    }
}
