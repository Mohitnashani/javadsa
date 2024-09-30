public class largest{
    public static void main(String[] args) {
        String fruit[]={"mango","apple","banana","orange"};
        String largest=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){
                largest=fruit[i];
            }
        }
        System.out.println("largest fruit is "+largest);
    }
}