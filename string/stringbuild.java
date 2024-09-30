public class stringbuild{
    public static void main(String[] args) {
        stringbuilder();
    }
    public static void stringbuilder(){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
//charecter.tString()
//Integer.toString()
//sb.toString()