package practice_program.java;
import java.util.Scanner;
public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int num=9;
      int m,n;
      // for outer loop
        for(m=1;m<num;m++) {
            // for inner loop
            for (n = 1; n < m; n++) {
                System.out.print(" ");
            }
            //for inner loop 2
            for (n = m; n <= num; n++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
          // outer loop 2
          for(m=num-1;m>=0;m--)
          {
              // inner loop 1
              for(n=0;n<m;n++)
              {
                  System.out.print(" ");
              }
              // inner loop 2
              for(n=m;n<=num-1;n++)
              {
                  System.out.print("*"+" ");
              }
              System.out.println(" ");
          }
        }
    }

