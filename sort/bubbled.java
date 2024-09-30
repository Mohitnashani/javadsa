package sort;

public class bubbled {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1;j++){
            if(arr[j+1]>arr[j]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}