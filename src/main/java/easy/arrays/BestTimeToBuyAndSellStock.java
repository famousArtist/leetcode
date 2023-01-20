package easy.arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{1}));
    }
// O(n^2) solution
//    public int maxProfit(int[] prices) {
//
//        int totalProfit = 0;
//        for (int i = 0; i < prices.length; i++) {
//
//            for (int j = i + 1; j < prices.length; j++) {
//                int currentProfit = prices[j] - prices[i];
//                if (totalProfit < currentProfit) {
//                    totalProfit = currentProfit;
//                }
//
//            }
//        }
//        return totalProfit;
//    }

    public int maxProfit(int[] prices) {

        int totalProfit = 0;
        int minimumPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minimumPrice) minimumPrice = price;
            else if (price - minimumPrice > totalProfit) {
                totalProfit = price - minimumPrice;
            }
        }
        return totalProfit;
    }
}
