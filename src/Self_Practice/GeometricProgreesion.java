package Self_Practice;
import java.util.Scanner;
public class GeometricProgreesion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth where the gp is printed : ");
        int n= sc.nextInt();
//          gp= 1,2,4,8,16,32,............
        int a=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            a*=2;


        }
    }
}
