import java.util.*;
public class reverse{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(reverseit(n)){
            System.out.println("number"+n+" is a palindrome");
        }
        else{
            System.out.println("number"+n+" is not a palindrome");
        }

    }
    public static boolean reverseit(int a){
        int b = a;
        int reverse=0;
        while(a!=0){
        int r = a%10;
        reverse=reverse*10+r;
        a=a/10;
        }
        if (b==reverse){
            return true;
        }
        else{
        return false;
        }
    }
}