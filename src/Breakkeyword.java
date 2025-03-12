import java.util.Scanner;
public class Breakkeyword {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        while(true)
        {
            if((num%5==0)&&(num%7==0)){
                System.out.println(" The multiple of 5 and 7: "+num);
                break;
            }
            num++;
        }

    }
}
