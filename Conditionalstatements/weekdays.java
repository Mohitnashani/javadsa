import java.util.*;

public class weekdays{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weekday number");
        int weekday=sc.nextInt();
        switch(weekday){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("tuesday");
            break;
            case 3 : System.out.println("wednesday");
            break;
            case 4 : System.out.println("thursday");
            break;
            case 5 : System.out.println("friday");
            break;
            case 6 : System.out.println("saturday");
            break;
            case 7 : System.out.println("sunday");
            break;
            default: System.out.println("invaild weekday"); 
        }
    }
}
            