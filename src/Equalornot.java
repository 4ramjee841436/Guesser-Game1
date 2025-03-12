import java.util.Scanner;
 public class Equalornot {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the first number");
         int num_1 = sc.nextInt();
         System.out.println("enter the second number");
         int num_2 = sc.nextInt();
         String result = (num_1 == num_2) ? "it is equal":"it is not equal";
         System.out.println(result);

     }
 }