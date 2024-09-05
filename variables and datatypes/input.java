import java.util.*;

public class input{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(input);
        
        Scanner st=new Scanner(System.in);
        String input2=st.nextLine();
        System.out.println(input2);

        Scanner sm=new Scanner(System.in);
        int input3=sm.nextInt();
        System.out.println(input3);

        Scanner sd=new Scanner(System.in);
        boolean input4=sd.nextBoolean();
        System.out.println(input4);
    }
}