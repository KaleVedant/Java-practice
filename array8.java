public class array8 {
    public static int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // update minimum price seen so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // update maximum profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int result = maximumProfit(prices);
        System.out.println("Maximum Profit: " + result);  // Output: 8
    }
}
