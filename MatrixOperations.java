import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Matrix 1:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 1:");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the number of rows for Matrix 2:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for Matrix 2:");
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        if (rows1 == rows2 && cols1 == cols2) {
            int[][] addition = new int[rows1][cols1];
            int[][] subtraction = new int[rows1][cols1];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    addition[i][j] = matrix1[i][j] + matrix2[i][j];
                    subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            
            System.out.println("Addition:");
            printMatrix(addition);
            
            System.out.println("Subtraction:");
            printMatrix(subtraction);
        } else {
            System.out.println("Addition and Subtraction cannot be performed: Matrices have different dimensions.");
        }
        if (cols1 == rows2) {
            int[][] multiplication = new int[rows1][cols2];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    multiplication[i][j] = 0;
                    for (int k = 0; k < cols1; k++) {
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            
            System.out.println("Multiplication:");
            printMatrix(multiplication);
        } else {
            System.out.println("Multiplication cannot be performed: Number of columns in Matrix 1 is not equal to the number of rows in Matrix 2.");
        }

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println("\n\nprogram by PUSHKAR [22BCS17250]");
            System.out.println();
        }
    }
}