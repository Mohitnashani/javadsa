import java.util.*;

public class sumofevenodd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int evensum=0;
        int oddsum=0;
        int choice;
        do{
            System.out.println("enter the number");
            a=sc.nextInt();

            if(a%2==0){
                evensum+=a;
            }
            else{
                oddsum+=a;
            }
            System.out.print("do you want to continue?press 1 for yes and 0 for no");
            choice=sc.nextInt();
        }
        while(choice==1);

        System.out.println("sum of even numbers="+evensum);
        System.out.println("sum of odd numbers="+oddsum);
    }
}