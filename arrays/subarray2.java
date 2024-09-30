public class subarray2{
    public static void main(String args[]){
        int num[]={-1,-2,-3,3,5,-5,-7,-9};
        subarray2(num);
        }
        public static void subarray2(int numbers []){
        int tp=0;
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
            for(int k=start;k<=end;k++){
            currsum=currsum+numbers[k];
            }tp++;
            if(maxsum<currsum){
            maxsum=currsum;
            }
            System.out.println("sum="+currsum);
            }
        }
        System.out.println("maxsum="+maxsum);
    System.out.println("total arrays="+tp);

    }
}