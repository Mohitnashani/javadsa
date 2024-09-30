public class charat{
    public static void charat(String name){
        System.out.println(name.charAt(0));
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        };

    }
    public static void main(String args[]){
        String name="mohit nashani";
        charat(name);
    }
}