public class compresser{
    public static void main(String args[]){
        String str="aabbbcccd";
        System.out.println(compresser(str));
    }
    public static String compresser(String str){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            count++;
        if(str.charAt(i)!=str.charAt(i+1)){
            sb.append(str.charAt(i));
            sb.append(count);
            count=0;
        }
    }
        return sb.toString();

    }
}