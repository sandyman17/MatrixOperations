/**
 * MatrixOperations
 * This code takes a matrix that is input by a test file
 * and completes operations with the given matrices.
 *
 * I got help from a friend outside of this cs 180 class with
 * how to utilize the attributes of the given matrices such as the rows and columns.
 *
 *
 * @author Jacob Sandefur
 * @version 3/2/2020
 *
 */
public class MatrixOperations extends Matrix {

    public MatrixOperations() {

    }
    public MatrixOperations(int[][] m) {
        super(m);
    }

    public boolean sameSizeMatrix(Matrix m1, Matrix m2) {
        return m1.matrix[0].length == m2.matrix[0].length && m1.matrix.length == m2.matrix.length;
    }

    public Matrix addMatrix(Matrix m1, Matrix m2) {
        if (sameSizeMatrix(m1, m2)) {
            int index[][] = new int[m1.matrix.length][m1.matrix[0].length];
            Matrix m3 = new Matrix(index);
            int row1 = m1.matrix[0].length;
            int col1 = m1.matrix.length;

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    m3.matrix[i][j] = (m1.matrix[i][j] + m2.matrix[i][j]);
                }
            }
            return m3;
        }
        else {
            return null;
        }
    }

    public Matrix subtractMatrix(Matrix m1, Matrix m2) {
        int index[][] = new int[m1.matrix.length][m1.matrix[0].length];
        Matrix m3 = new Matrix(index);
        if (sameSizeMatrix(m1, m2)) {
            int row1 = m1.matrix[0].length;
            int col1 = m1.matrix.length;

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    m3.matrix[i][j] = (m1.matrix[i][j] - m2.matrix[i][j]);
                }
            }
            return m3;
        }
        else {
            return null;
        }
    }

    public Matrix transposeMatrix(Matrix m1) {
        int row3 = m1.matrix[0].length;
        int col3 = m1.matrix.length;
        int index[][] = new int[m1.matrix[0].length][m1.matrix.length];
        Matrix m3 = new Matrix(index);
        for (int i = 0; i < row3 ; i++) {
            for (int j = 0; j < col3; j++) {
                m3.matrix[i][j] = m1.matrix[j][i];
            }
        }
        return m3;
    }

    public Matrix productMatrix(Matrix m1, Matrix m2) {
        if (m1.matrix.length != m2.matrix[0].length) {
            return null;
        }
        int row2 = m1.matrix.length;
        int col2 = m2.matrix[0].length;
        int col11 = m1.matrix[0].length;
        int index[][] = new int[m1.matrix.length][m1.matrix[0].length];
        Matrix m3 = new Matrix(index);
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col11; k++) {
                    m3.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return m3;
    }
    public void printMatrix(Matrix m1) {
        if (m1 == null) {
            return;
        }
        for (int i = 0; i < m1.matrix[0].length; i++) {
            for (int j = 0; j < m1.matrix.length; j++) {
                System.out.print((m1.matrix[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }

}
