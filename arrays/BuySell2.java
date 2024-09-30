public class BuySell2 {  
   public static void main(String[] args) {  
      int[] price = {7, 1, 5, 3, 6, 4};  
      buysell(price);  
   }  
  
   public static void buysell(int[] price) {  
      int maxProfit = 0;  
      int buyDay = 0;  
      int sellDay = 0;  
      int minPrice = price[0];  
  
      for (int i = 0; i < price.length; i++) {  
        if (price[i] < minPrice) {  
           minPrice = price[i];  
        } else if (price[i] - minPrice > maxProfit) {  
           maxProfit = price[i] - minPrice;  
           buyDay = getPriceIndex(price, minPrice);  
           sellDay = i;  
        }  
      }  
  
      System.out.println("Buy day: " + buyDay + ", Sell day: " + sellDay + ", Maximum profit: " + maxProfit);  
   }  
  
   private static int getPriceIndex(int[] price, int target) {  
      for (int i = 0; i < price.length; i++) {  
        if (price[i] == target) {  
           return i;  
        }  
      }  
      return -1;  
   }  
}