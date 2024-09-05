import java.util.*;

public class sumofnnumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=1;
        int b=0;
        int n=sc.nextInt();
        while(a<=n){
            b=b+a;
            a++;    
         }
        System.out.print("sum of n natural numbers="+b);
    }
}