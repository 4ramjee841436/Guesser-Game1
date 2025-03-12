package Reursion;
import java.util.Scanner;
public class Maze_path {
    public static int maze(int row,int col,int m,int n)
    {
        if(row==m || col==n)
        {
            return 1;
        }
        int right_ways=maze(row+1,col,m,n);
        int down_ways=maze(row,col+1,m,n);
        int total_ways=right_ways+down_ways;
        return total_ways;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m and n :: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(" Total no-of maze path is :: "+maze(1,1,m,n));
    }
}
