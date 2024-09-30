public class buysell1{
        public static int buyselln(int price[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<price.length-1;i++){
                if(buyprice<price[i]){
                        int profit=price[i]-buyprice;
                        maxprofit=Math.max(maxprofit,profit); 
                }
        }
            return maxprofit;
        }
}