import java.util.*;
//input cost of items and output the total cost with gst
public class assignment12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pencil=sc.nextInt();
        int pen=sc.nextInt();
        int eraser=sc.nextInt();
        double total=(pencil+pen+eraser)*1.18;
        System.out.println(total);
    }
}
