package practice_program.java;
import java.util.Scanner;
// given three points (x1,y1),(x2,y2),(x3,y3) and check it is straight line or not
public class Check_stright_line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int slope_m1;
        int slope_m2;
        System.out.println("Enter the six points ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        int y3=sc.nextInt();
        slope_m1=(y2-y1)/(x2-x1);
        slope_m2=(y3-y2)/(x3-x2);
        if(slope_m1==slope_m2)
        {
            System.out.println("it is lies on the straight line");
        }
        else {
            System.out.println("it is not lies on the straight line");
        }

    }
}
