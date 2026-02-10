public class Matrix {
    private byte[][] matrix;

    public Matrix(byte[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            this.matrix = new byte[0][0];
        } else {
            this.matrix = matrix;
        }
    }

    public void printMatrix() {
        if (matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public byte[][] transposeMatrix() {
        if (matrix.length == 0) {
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

    public void printRowAverages() {
        if (matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }
        System.out.println("\nThe average value of the elements of each row:");

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            double average = sum / (double) matrix[i].length;
            System.out.printf("Row %d: %.2f%n", i + 1, average);
        }
    }
}
