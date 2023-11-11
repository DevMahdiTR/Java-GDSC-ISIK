package Arrays;

public class MatrixExampleInMain {

    public static void main(String[] args) {
        // 1. Initializing a 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2. Accessing elements in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        // 3. Displaying the entire matrix
        System.out.println("Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        // 4. Finding the sum of all elements in the matrix
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Sum of all elements in the matrix: " + sum);

        // 5. Transposing a matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposedMatrix[col][row] = matrix[row][col];
            }
        }

        // Displaying the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int row = 0; row < transposedMatrix.length; row++) {
            for (int col = 0; col < transposedMatrix[row].length; col++) {
                System.out.print(transposedMatrix[row][col] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }

        // 6. Multiplying two matrices
        int[][] matrixA = {
                {1, 2},
                {3, 4}
        };
        int[][] matrixB = {
                {5, 6},
                {7, 8}
        };
        int[][] productMatrix = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Displaying the product of matrices
        System.out.println("Product of Matrices A and B:");
        for (int row = 0; row < productMatrix.length; row++) {
            for (int col = 0; col < productMatrix[row].length; col++) {
                System.out.print(productMatrix[row][col] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
