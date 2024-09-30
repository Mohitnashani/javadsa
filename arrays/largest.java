public class largest{
    public static int[] larg(int A[]){
        int m=Integer.MIN_VALUE;
        int n=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(m<A[i]){
                m=A[i];
            }
            if(n>A[i]){
                n=A[i];
            }
        }
        return new int[] {m,n};
    }
    public static void main(String args[]){
        int []B={1,3,4,6,4,20,4,6};
        int []res=larg(B);
        System.out.println("largest value is:"+res[0]);
    }
}