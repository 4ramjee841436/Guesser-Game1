package practice_program.java;
import java.util.Scanner;
// Wajp to java method to display the middle charac
public class Practice_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int sold= 12*y;
       float profit= x-sold;
    float loss= sold-x;
        if(x>sold)
            System.out.println(profit);
        else
            System.out.println(loss);


    }
}
