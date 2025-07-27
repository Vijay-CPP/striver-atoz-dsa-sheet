
//import java.lang.*;
import java.util.*;

class BestTimeToBuyAndSellStock {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(prices);

        System.out.println("Maximum profit you can achieve is: " + maxProfit);
        sc.close();
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE;
        int res = 0;

        for (int ele : prices) {
            currMin = Math.min(currMin, ele);
            res = Math.max(res, ele - currMin);
        }

        return res;
    }
}