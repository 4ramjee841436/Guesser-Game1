package practice_program.java;
import java.util.Scanner;
// to input the value and check how much profit and loss is occur
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,l;
        System.out.println("Enter the cost price");
        float cp=sc.nextFloat();
        System.out.println("Enter the selling price");
        float sp=sc.nextFloat();
        p=sp-cp;
        l=cp-sp;
        if(sp>cp)
        System.out.println(" Profit is: "+p);
        else
            System.out.println(" Loss is: "+l);

    }
}
