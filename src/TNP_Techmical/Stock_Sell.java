package TNP_Techmical;

import java.util.Scanner;

public class Stock_Sell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int profit = price[j] - price[i];
                // Update maxProfit if  profit is greater
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
