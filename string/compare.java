public class compare{
    public static void main(String[] args) {
        String s1="Mohit";
        String s2="Mohit";
        String s3=new String("Mohit");
        if(s1==s2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(s1==s3){
            System.out.println("true"); 
        }
        else{
            System.out.println("false");
        }
        if(s1.equals(s3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}