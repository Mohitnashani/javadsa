import java.util.Scanner;
public class average {    
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
         System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scan.nextDouble();
        scan.close();
        System.out.println("Average of 3 numbers is:"+avr(num1,num2,num3));
    }
    public static double avr(double num1,double num2,double num3){
        return(num1+num2+num3)/3;
    }
}