import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int a=sc.nextInt();
        System.out.println("enter number 2:");
        int b=sc.nextInt();
        System.out.println("enter operator:");
        char operator =sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default : System.out.println("operator invaild");
        }
    }
}