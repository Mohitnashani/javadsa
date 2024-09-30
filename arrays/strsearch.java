public class strsearch{
    public static int ss(String[] A,String key){
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
            return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String A[]={"Rice","Dal","roti","sweet"};
        String key ="roti";
        int index=ss(A,key);
        System.out.println("index of "+key+" "+index);

    }
}