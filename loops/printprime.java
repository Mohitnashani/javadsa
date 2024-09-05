import java.util.*;

public class printprime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean prime=true;
        if (n==2){
            prime=true;
        }
        else{
            for(int i=2;i<=n-1;i++){
            if(n%i==0){
                prime=false;
            
            }
            }
            if(prime==true){
                System.out.print("n is prime");
                }
                else{
                    System.out.print("n is not prime");
                    }
                    }
    }
}