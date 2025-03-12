
// Roots of a quadratic equation
import java.util.Scanner;
class quadratic
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the value of a ,b and c ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        double r1,r2;
        float D=(b*b)-(4*a*c);
        if(D>0)
        {
            r1=(-b+Math.sqrt(D))/(2*a);
            r2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("The roots are:"+r1+" " +r2);
        }
        else if(D==0)
        {
            r1=-b/(2*a);
            r2=-b/(2*a);
            System.out.println("The roots are:"+r1+" " +r2);
        }
        else
        {
            System.out.println("The roots are imaginary roots");
        }
    }
}
