import java.util.*;

public class bintodec{ 
static void bintodec(int n){
    int pow=0;
    int decNum=0;
    while (binNum>0){
        int ld=binNum%10;
        decNum=decNum+(ld*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;
    }
System.out.println("decimal of"+binNum+" = "+decNum);
}
}

public static void main(String args[]){
    bintodec(101);
}