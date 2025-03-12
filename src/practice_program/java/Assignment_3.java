package practice_program.java;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" \"Hello\", \"Welcome to java World \" ,\"A very good morning\"  ");
        System.out.println(" \"Ramjee\" "+"\n\n"+" \"22CSE175\" ");
        System.out.println("Enter the two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("the sum of number is:"+ Addition(n1,n2));
    }
    public static int Addition(int n1,int n2)
    {
        return n1+n2;
    }

    }

