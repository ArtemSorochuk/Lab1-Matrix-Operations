class Main {
    private static void printMatrix(byte[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static byte[][] transposeMatrix(byte[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new byte[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        byte[][] transposed = new byte[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        byte[][] matrixB = {
                { 10, 19 },
                { -41, 23 },
                { 10, -40 }
        };

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        byte[][] matrixC = transposeMatrix(matrixB);

        System.out.println("\nMatrix C = Transpose of Matrix B:");
        printMatrix(matrixC);

        System.out.println("\nThe average value of the elements of each row:");
        for (int i = 0; i < matrixC.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrixC[0].length; j++) {
                sum += matrixC[i][j];
            }
            double average = sum / (double) matrixC[i].length;
            System.out.printf("Row %d: %.2f%n", i + 1, average);
        }
    }
}