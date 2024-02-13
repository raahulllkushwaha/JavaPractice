import java.util.Scanner;

public class matrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][4];
        int b[][] = new int[3][4];
        int c[][] = new int[3][4];

        System.out.println("Enter the elements of firsr matrix multiplication: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the elements of second matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition the the matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum is: ");
        
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.println(c[i][j] + " ");
                }
                System.out.println();
            }
        
    }
}
