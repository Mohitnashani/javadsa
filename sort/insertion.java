package sort;
public class insertion{
    public static void main(String[] args) {
        int arr[]={4,6,3,2,9,7,5};
        insert(arr);
    }
    //3,4,6,2,9,7,5
    //2,3,4,6,9,7,5
    //2,3,4,6,7,9,5
    //2,3,4,6,7,5,9
    //4,6,3,2,9,7,5
    public static void insert(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
             while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];

                prev--;
            }
            arr[prev+1]=curr;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}