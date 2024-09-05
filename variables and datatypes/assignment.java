import java.util.*;
//input three numbers and output the average of these 3 numbers
public class assignment{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);
    }
}