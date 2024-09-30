
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.naming.ldap.SortControl;

public class practice{
    public static void main(String[] args) {
        String str="mohit nashani";
        String str1="racecar";
        String str2="racecr";
        System.out.println(lowervow(str));
        System.out.println(anagram(str1,str2));
    }
    public static int lowervow(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean anagram(String str1,String str2){
        str1.toLowerCase();
        str2.toLowerCase();
        boolean result;
        if(str1.length()==str2.length()){
            char[] strchar1=str1.toCharArray();
            char[] strchar2=str2.toCharArray();
            Arrays.sort(strchar2);
            Arrays.sort(strchar1);
            if(Arrays.equals(strchar1,strchar2)){
                System.out.println("Anagram");
                result= true;
            }
            else{
                System.out.println("Not Anagram");
                result= false;
            }
        }
        else{
            System.out.println("length not equal");
            result=false;
        }
        return result;
    }
}