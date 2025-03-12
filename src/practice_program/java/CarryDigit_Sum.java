package practice_program.java;

import java.util.Scanner;

public class CarryDigit_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int count=0;
        int temp1= num1;
        int temp2= num2;
        int r1=0;
        int r2=0;
        while(temp1!=0 && temp2!=0) {
            while (temp1 != 0) {
                r1 = temp1 % 10;
                temp1/=10;
            }
        }
    }
}
