package practice_program.java;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int x =(n1 > n2)? n1:n2;
        int y =(x> n3)? x:n3;
        System.out.println("The largest number is: "+y);
    }
}
