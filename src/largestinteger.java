import java.util.Scanner;
public class largestinteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three numbers");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        int num_3=sc.nextInt();
        int x =(num_1 > num_2)? num_1:num_2;
        int y =(x> num_3)? x:num_3;
        System.out.println("the greatest number is "+y);
    }
}
