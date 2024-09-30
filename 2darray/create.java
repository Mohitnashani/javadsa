import java.util.*;

public class create{
    
    public static void main(String args[]) {
        // Create a 2x3 matrix
        int matrix[][] = new int[2][3];
        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns
        
        Scanner sc = new Scanner(System.in);
        
        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt(); 
            }
        }
        
        // Display the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
        
        // Search for the key (5 in this case)
        int key = 5;  // You can change this to any value you want to search for
        search(matrix, key);
    }
    
    // Function to search for a specific key in the matrix
    public static void search(int matrix[][], int key) {
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at position: " + i + ", " + j);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Key not found.");
        }
    }
}
