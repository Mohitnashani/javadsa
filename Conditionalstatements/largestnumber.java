import java.util.*;

public class largestnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c= sc.nextInt();
        if((a>=b)&&(a>=c)){
            System.out.println("a is largest");
        }
        else if(b>=c){
            System.out.println("b is largest");
        }
        else{System.out.println("c is largest");
        }
    }
}