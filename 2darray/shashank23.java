public class shashank23 {
    public static void main(String args[])
    int a=0;

     int arr[]={4,6,9,3,6,9,0,2,5,8};
     int largest=Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {
        largest=Math.max(largest,arr[i]);  
     }
     int count[]=new int[largest+1];
     for (int i = 0; i < arr.length; i++) {
         count[arr[i]]++;
     if(count[arr[i]]>1){
        b=arr[i];
     }
     }
     System.out.println(b);   
    }
}
