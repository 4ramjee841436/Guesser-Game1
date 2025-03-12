package PW_COURSE.java;
import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=5;
        System.out.println("Enter the principle Amount : ");
        int p= sc.nextInt();
        System.out.println("Enter the time period : ");
        int t= sc.nextInt();
        int SI= (p*r*t)/100;
//        Compound_Interest c= new Compound_Interest();
//        Compound_Interest c1= new Compound_Interest();
//        Compound_Interest c2=new Compound_Interest();
        System.out.println("Simple Interest is : "+SI);


    }
}
