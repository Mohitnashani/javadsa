import java.util.*;

public class reverseno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int n=sc.nextInt();
        while(n>0){
            int ld=n%10;
            n=n/10;
            rev=(rev*10)+ld;
        }
    System.out.println(rev);
    }
}