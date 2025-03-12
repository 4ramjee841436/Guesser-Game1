import java.util.Scanner;
public class findinggrade {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the percentage");
       float p=sc.nextFloat();
       if(p<101 && p>90)
           System.out.println("the seccured grade is:"+'O');
       else if(p<89 && p>80)
           System.out.println("the seccured grade is:"+'E');
       else if(p<79 && p>70)
           System.out.println("the seccured grade is:"+'A');
       else if(p<69 && p>60)
           System.out.println("the seccured grade is:"+'B');
       else if(p<59 && p>50)
           System.out.println("the seccured grade is:"+'C');
       else if(p<49 && p>40)
           System.out.println("the seccured grade is:"+'D');
       else
           System.out.println("the seccured grade is:"+'F');


    }
}
