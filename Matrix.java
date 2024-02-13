import java.util.Scanner;

public class Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int rows, columns;

        // Declaration of rows and columns
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        columns = sc.nextInt();

        // Input matrices based on user-defined rows and columns
        int a[][] = new int[rows][columns];
        int b[][] = new int[rows][columns];

        // Input matrix 'a'
        System.out.println("Enter elements for matrix 'a':");
        inputMatrixElements(a, sc);

        // Input matrix 'b'
        System.out.println("Enter elements for matrix 'b':");
        inputMatrixElements(b, sc);

        // Creating another matrix to store the sum of two matrices
        int c[][] = new int[rows][columns];

        // Adding and printing the sum of two matrices
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] + b[i][j]; // Use - for subtraction
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // New line
        }

        // sc.close();
    }

    // Function to input matrix elements
    private static void inputMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
}
