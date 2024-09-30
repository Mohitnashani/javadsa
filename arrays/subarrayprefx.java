public class subarrayprefx{
    public static void main(String args[]){
        int array[]={1,-2,6,-1,3};
        subarray(array);
        }
    public static void subarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=1;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=start==0 ?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            }
        System.out.println("Maxsum="+maxsum);
        }
}