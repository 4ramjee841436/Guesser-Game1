import java.util.Scanner;
// percentage of three subject marks
public class markspercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.println("enter the first subject marks");
        int m1=sc.nextInt();
        System.out.println("enter the second subject marks");
        int m2=sc.nextInt();
        System.out.println("enter the third subject marks");
        int m3=sc.nextInt();
        p=((m1+m2+m3)/300)*100;
        System.out.println("percentage of marks is: "+p);
    }
}
