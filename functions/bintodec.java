import java.util.*;

public class bintodec{
    public static void bintodec(int n){
    int pow=0;
    int decNum=0;
    int binNum=n;
    while (binNum>0){
        int ld=binNum%10;
        decNum=decNum+(ld*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
    System.out.println("decimal of "+n+" = "+decNum);
}

public static void main(String args[]){
    bintodec(10101110);
}
}