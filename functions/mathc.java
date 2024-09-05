import java.util.*;
public class mathc{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println("minium of"+a+" "+b+" "+c+" "+d+"is"+Math.min(Math.min(a,b),Math.min(c,d)));
        System.out.println("max of"+a+" "+b+" "+c+" "+d+"is"+Math.max(Math.max(a,b),Math.max(c,d)));
        System.out.println("sqrt of"+a+"is"+Math.sqrt(a));
        System.out.println(a+"raise to 10 is"+Math.pow(a,10));
        //System.out.println("average of"+a+b+c+d+"is"+Math.avg(a,b,c,d));//
        System.out.println("absolute value of a is"+Math.abs(a));
    }
}