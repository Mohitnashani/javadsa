public class spiral {

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
            for(int i=startr+1;i<=endr;i++){
                System.out.print(matrix[i][endc]+" ");
            }
            for(int j=endc-1;j>=startc;j--){
                System.out.print(matrix[endr][j]+" ");
            }
            for(int i=endr-1;i>startr;i--){
                System.out.print(matrix[i][startc]+" ");
            }
        
        startr++;
        endr--;
        startc++;
        endc--;
        }
    }
}