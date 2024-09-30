public class substr{
    public static void main(String[] args) {
        String str="mohit nashani";
        System.out.println(substr(str,0,3));
        //str.substring(0,5);
    }
    public static String substr(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
}