
import java.util.jar.Attributes;
import javax.swing.filechooser.FileNameExtensionFilter;

public class palindrome{
    public static void main(String args[]){
        String fname="racecar";
        System.out.println(palindrome(fname));
        }
    public static boolean palindrome(String name){
        int n=name.length();
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}