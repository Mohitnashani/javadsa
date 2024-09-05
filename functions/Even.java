import java.util.Scanner;
public class Even{
        public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(iseven(n)){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }
    public static boolean iseven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}