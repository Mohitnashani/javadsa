public class subarray{
    public static void main(String args[]){
        int numbers []={1,4,5,6,8,10,45};
        subarray2(numbers);
        }
        public static void subarray2(int numbers []){
        int tp=0;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }System.out.print("sum="+sum);
                System.out.println();
            //System.out.print(numbers[j]+" ");
            //for(int k=start;k<=end;k++){
            //System.out.print(numbers[k]+" ");
            //sum=sum+numbers[k];
            tp++;
            
        }
            System.out.println();
            //System.out.println("sum="+sum);
            }
            System.out.println("total arrays="+tp);
        }
}