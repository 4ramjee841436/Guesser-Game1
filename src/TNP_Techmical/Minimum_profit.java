package TNP_Techmical;

import java.util.Scanner;

public class Minimum_profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1 ; j < n; j++) {
                int loss = price[i] - price[j];
              if(loss>=1)
                result=Math.min(loss,result);

                }
            }
        System.out.println(result);
        }
    }

