import java.util.*;

public class nestedloopi{
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=4;i++){
            for(int S=1;S<=(n-i+1);S++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}