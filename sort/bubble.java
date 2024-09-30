package sort;
public class bubble{
    public static void main(String[] args) {
        int array[]={3,6,2,1,15,8,7,4,5,3,1};
        //3,2,1,6,8,7,4,5,3,1,15
        //2,1,3,6,7,4,5,3,1,8,15
        //1,2,3,6,4,5,3,1,7,8,15
        //1,2,3,4,5,3,1,6,7,8,15
        //1,2,3,4,3,5
        bubble(array);
    }
    public static void bubble(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}