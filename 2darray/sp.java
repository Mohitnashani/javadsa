public class sp {

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        spiral(matrix);
    }
    public static void spiral(int matrix[][]){
        int startr=0;
        int endr=matrix.length-1;
        int startc=0;
        int endc=matrix[0].length-1;
        while(startr<=endr && startc<=endc){
            for(int j=startc;j<=endc;j++){
                System.out.print(matrix[startr][j]+" ");
            }
            for(int j=startr+1;j<=endr;j++){
                System.out.print(matrix[j][endc]+" "); 
            }
            if(startr<endr){            
            for(int j=endc-1;j>=startc;j--){
//               if(startr==endr){
//               break;                
                System.out.print(matrix[endr][j]+" ");
            }
        }
            if(startc<endc){
            for(int j=endr-1;j>startr;j--){
//                if(startc==endc){
//                  break;                
                System.out.print(matrix[j][startc]+" ");                
            }
        }
        startr++;
        endr--;
        startc++;
        endc--;
        }
    }
}