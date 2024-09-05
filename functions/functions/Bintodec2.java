import java.util.*;

public class BinToDec2 { 
    public static void binToDec(int n){
        int pow = 0;
        int decNum = 0;
        int binNum = n;  // use the parameter 'n' to initialize binNum
        
        while (binNum > 0) {
            int ld = binNum % 10;
            decNum = decNum + (ld * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        
        System.out.println("Decimal of " + n + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(1011);  // Example usage
    }
}
