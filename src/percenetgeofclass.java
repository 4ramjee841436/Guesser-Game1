import java.util.Scanner;
public class percenetgeofclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage");
        float p=sc.nextFloat();
        if(p<101 && p>59)
            System.out.println("first class");
        else if(p<59 && p>49)
            System.out.println("second class");
        else if(p<50 && p>32)
            System.out.println("third class");
        else
            System.out.println("fail");
    }
}