package sort;

public class selectiond {
    public static void main(String[] args) {
        int arr[]={1,5,8,6,2,4,7,9};
        selectiond(arr);
    }
    public static void selectiond(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
       for(int i=0;i<arr.length;i++){
       System.out.print(arr[i]+" ");
    }
}
}
