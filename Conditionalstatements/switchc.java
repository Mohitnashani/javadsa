import java.util.*;

public class switchc{
    public static void main(String args[]){
        int number;
        Scanner sc= new Scanner(System.in);
        number= sc.nextInt();
        switch(number){
            case 1 : System.out.println("samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("icecream");
            break;
            default : System.out.println("Kuch nahi milega");
            
        }
    }
}