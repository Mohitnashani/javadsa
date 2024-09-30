public class shortest{
    public static void main(String[] args) {
        String way="WEEEEENNN";
        shortest(way);
        System.out.print(shortest(way));
    }
    public static float shortest(String way){
        int x=0,y=0;
        for(int i=0;i<way.length();i++){
            if(way.charAt(i)=='N'){
                y++;
            }
            else if(way.charAt(i)=='S'){
                y--;
            }
            else if (way.charAt(i)=='W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        
        return (float)Math.sqrt(X2+Y2);
    }
}