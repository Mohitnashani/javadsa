import java.util.*;

public class tables{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int i=1;
        for(;i<=24;i++){
            int T=i*N;
        
        System.out.println(N+"*"+i+"="+T);
        }
    }
}