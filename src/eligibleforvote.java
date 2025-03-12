import java.util.Scanner;
public class eligibleforvote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        String  result =(age>=18)?"it is eligible for vote":" it is not eligible";
        System.out.println(" "+result);
    }
}
