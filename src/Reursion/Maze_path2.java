package Reursion;
import java.util.Scanner;
public class Maze_path2 {
    public static int maze2(int m,int n)
    {
        if(m==1 || n==1)
        {
            return 1;
        }
        int right_ways=maze2(m,n-1);
        int down_ways=maze2(m-1,n);
        int total_ways=right_ways+down_ways;
        return total_ways;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m and n :: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(" Total no-of maze path is :: "+maze2(m,n));
    }
}


