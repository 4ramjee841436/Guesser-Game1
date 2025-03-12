import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num_1=sc.nextInt();
        String result=(num_1%12 ==0)?"it is divisible ":"it is not divisible";
        System.out.println(result);
    }
}
