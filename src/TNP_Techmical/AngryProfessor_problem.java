package TNP_Techmical;

import java.util.Scanner;

public class AngryProfessor_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int [] std= new int[n];
        for(int i=0;i<n;i++)
        {
            std[i]= sc.nextInt();
        }
        int count=0;
        for(int s1:std)
        {
            if(s1<=0)
                count++;
        }
        if(count>=x)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
