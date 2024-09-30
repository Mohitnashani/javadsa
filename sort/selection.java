package sort;


public class selection {
    public static void main(String args[]){
        int arr[]={8,2,4,5,1,7,6,9,3};
        selection(arr);
        //{2,}
    }
    public static void selection(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int min=turn;
            for(int j=turn+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
        }
        int temp=arr[min];
        arr[min]=arr[turn];
        arr[turn]=temp;   
        }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}