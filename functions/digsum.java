import java.util.*;

public class digsum { 
    public static void main (String args []){
        int sum =0;
        Scanner sc= new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int rem=0;
        while(n>0){
        rem=n%10;
        sum=sum+rem;
        n=n/10;
        }
    System.out.println("sum of digits="+sum);
    }
}