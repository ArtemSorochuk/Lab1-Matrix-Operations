public class Main {
    public static void main(String[] args) {
        byte[][] matrix = {
                { 10, 19 },
                { -41, 23 },
                { 10, -40 }
        };

        Matrix matrixB = new Matrix(matrix);
        System.out.println("Matrix B:");
        matrixB.printMatrix();

        Matrix matrixC = new Matrix(matrixB.transposeMatrix());
        System.out.println("\nTransposed matrix B:");
        matrixC.printMatrix();

        matrixC.printRowAverages();
    }
}
