package TNP_Techmical;

import java.util.Scanner;

public class Rat_food_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int unit= sc.nextInt();
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int food= r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(food<=sum) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(count-1);
    }
}
