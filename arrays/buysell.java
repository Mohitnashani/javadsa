public class buysell{
        public static int buyselln(int price[]){
        int maxprofit=0;
        for(int i=0;i<price.length-1;i++){
            for(int j=i+1;j<price.length;j++){
                int profit=price[j]-price[i];
                maxprofit=Math.max(profit, maxprofit);
        }
    }
    return maxprofit;
    }
    public static void main(String args[]){
        int price[]={7,1,5,3,6,4};
        System.out.println(buyselln(price));
    }
}