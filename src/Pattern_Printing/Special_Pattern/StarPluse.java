package Pattern_Printing.Special_Pattern;
import java.util.Scanner;
public class StarPluse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the N values :: ");
        int n= sc.nextInt();
        int mid= n/2+1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i== mid || j== mid)
                    System.out.print("*"+" ");
                else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
