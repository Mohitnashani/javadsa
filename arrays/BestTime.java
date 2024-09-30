public class BestTime {
    public static int maxProfit(int[] prices) {
       int maxProfit = 0;
       for(int i = 0; i < prices.length - 1; i++){
           for(int j = i + 1; j < prices.length; j++)
           {   int profit = prices[j] - prices[i];
               maxProfit = Math.max(profit, maxProfit);
           }
       }
       return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println("Maximum profit in prices1 array is: ");
        int[] prices1 = {7, 1, 5, 4, 3, 6};
        System.out.println(maxProfit(prices1));
    }
}
