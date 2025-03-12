package PW_COURSE.java;
import java.util.Scanner;
 public class Array_input {
     public static void main(String[] args) {
         int size = 0;
         System.out.println("Enter the size of array: ");
         Scanner sc = new Scanner(System.in);
         size = sc.nextInt();
         int[] arr = new int[size];
         for (int i = 0; i < arr.length; i++) {
             System.out.print("Enter the array values:: ");
             arr[i] = sc.nextInt();
         }
         for (int i = 0; i < arr.length; i++) {
             System.out.print("The array value is::");

             System.out.print(arr[i] + "\t");
             System.out.println();
         }

     }
 }