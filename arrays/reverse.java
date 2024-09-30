public class reverse{
    public static void main(String args[]){
        int num[]= new int[] {1,6,6,8,56,45,12,2};
         reverse(num);
         System.out.print("{");
         for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
            if(i<num.length-1){
            System.out.print(",");
            }
         }
         System.out.print("}");
    }
    public static void reverse(int numbers[]) {
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
           
        }
    }
}