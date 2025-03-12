package practice_program.java;

import java.util.Scanner;

public class Evil_Oddils {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        int count=0; // it count no-of 1's
        while(n>0)
        {
            count+= n & 1;
            n=n>>1;
        }
       if(count % 2 ==0)
           System.out.println("Given number is Evil :");
       else
           System.out.println("Given number is oddil");
    }
}
