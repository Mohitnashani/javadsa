
import java.awt.font.NumericShaper;

public class practice {
    public static void main(String[] args) {
        int matrix[][]={{4,6,7},{5,7,8}};
        int seven=seven(matrix);
        System.out.println(seven);
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int summ=sum(nums);
        System.out.println(summ);
        transpose(matrix);
    }
    public static int seven(int matrix[][]){
        
        int count=0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j <matrix[0].length; j++) {
                if(matrix[i][j]==7){
                    count++;
                }
            }
            
        }
        //System.out.print(count);
        return count;
    }
    public static int sum(int nums[][]){
        int add=0;
        for(int i=0;i<nums[1].length;i++){
            add=add+nums[1][i];
        }
        return add;
    }
    /*public static int[][] transpose(int matrix[][]){
        int col=matrix[0].length;
        int row=matrix.length;
        int tr[][]=new int [col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                tr[j][i]=matrix[i][j];
            }
        }
        return tr;
    }*/
    public static void transpose(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
            System.out.println(" ");
        int col = matrix[0].length; // Number of columns in the original matrix
        int row = matrix.length; // Number of rows in the original matrix
        int tr[][] = new int[col][row]; // Transposed matrix dimensions are swapped
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tr[j][i] = matrix[i][j]; // Swap indices for correct transposition
            }
        }    
        for (int i = 0; i < tr.length; i++) {
            for(int j=0;j<tr[0].length;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
