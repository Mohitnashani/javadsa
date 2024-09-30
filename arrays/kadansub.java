public class kadansub{
    public static int kadan(int numbers[]){
        int ms=0;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            if(cs<0){
                cs=0;
            }
            cs=cs+numbers[i];
            if(cs>ms){
                ms=cs;
            }
            //ms=Math.max(ms, cs);
        }
        System.out.println("maxsum="+ms);
        return ms;
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadan(numbers);
    }
}
