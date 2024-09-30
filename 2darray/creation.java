import java.util.Scanner;
public class creation{
    //public static void main(String[] args) {
    //  int []={}
    //}
    public static void main(String args[]){
      int matrix[][]=new int[2][3];
      int n=matrix.length;
      int m=matrix[0].length;
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt(); 
        }
      }
      for (int i = 0; i < n; i++) { 
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
      search(matrix/* ,key*/);
    }
    public static boolean search(int matrix[][]/*,int key*/){
      int largest=Integer.MIN_VALUE;
      int li=0;
      int ji=0;
      for (int i = 0; i < matrix.length; i++) {
        for(int j=0;j<matrix[0].length;j++){
          if(largest<matrix[i][j]){
            largest=matrix[i][j];
            li=i;
            ji=j;
          }          
        }
        
        }
            System.out.print("found"+largest+"at"+li+" "+ji);
            return true;
      }
    }