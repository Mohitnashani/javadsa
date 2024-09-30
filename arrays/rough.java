public class rough {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=i;
            int prev=i-1;
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void count(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
            //count[arr[i]]++;
        }
        int sorted[]= new int[arr.length];
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                // for(int j=0;j<sorted.length;j++){
                //     sorted[j]=i;
                //     count[i]--;
                sorted[index]=i;
                index++;
                count[i]--;

                }
                //count[i]--;
            }
        
        for(int k=0;k<sorted.length;k++){
            System.out.print(sorted[k]+" ");
        }
    }
        //A={4,5,6,7,4,3,6,7,}
        /*A={4,5,6,7,3,4,6,7}
        A={1,2,8,9,10,11,12}
         */
    public static void main(String[] args) {
        int arr[]={8,5,2,5,7,11,6,1,10};
        //insertion(arr);
        count(arr);
    }
}
