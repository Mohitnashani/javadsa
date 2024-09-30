package sort;

public class insertiond {
    public static void main(String[] args) {
        int arr[]={4,2,3,5,8,6,9,6};
        //43258696
        //43228696
        //4332
        //4432
        
        insertiond(arr);
    }
    public static void insertiond(int[] arr){

        for(int i=1;i<arr.length;i++){

            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;    
            }
            arr[prev+1]=curr;
        }
    }
}