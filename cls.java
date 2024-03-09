import java.util.Scanner;
public class cls {
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // arr[0]= 12;
        // arr[1]=56;
        // arr[2]=30;
        // arr[3]=30;
        // arr[4]=30;
        // for(int i=0; i<=arr.length; i++){
        //     System.out.println("Elements at Index: " + i + ": " + arr[i]);
        // }

        // int arr1[]={1,2,3,4,5};
        // // accessing the elements of the specified array
        // for (int i = 0; i < arr1.length; i++)
        //     System.out.println("Element at index " + i
        //                        + " : " + arr1[i]);

            Scanner sc = new Scanner(System.in);
            int row, col;
            System.out.println("Enter the size of the row: ");
            row = sc.nextInt();
            System.out.println("Enter the elements of column");
            col= sc.nextInt();
            int a[][]= new int[row][col];
            int b[][]= new int[row][col];
            int c[][]= new int[row][col];

            System.out.println("Enter the elements for first matrix: ");
            for(int i=0; i<row;i++){
                for(int j=0; j<col; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the element for second matrix: ");
            for(int i=0; i<row;i++){
                for(int j=0; j<col; j++){
                    b[i][j]=sc.nextInt();
                }
            }
            //Addition of matrix
            for(int i=0; i<row;i++){
                for(int j=0; j<col; j++){
                   c[i][j]=  a[i][j] + b[i][j];
                }
            }
            System.out.println("Sum of the matrix is: ");
            for(int i=0; i<row;i++){
                for(int j=0; j<col; j++){
                  System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
    }
}
