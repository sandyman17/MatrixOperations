/**
 * Matrix
 * This code constructs a matrix from a given input from a test file.
 *
 * I got help from a friend outside of this cs 180 class with
 * how to utilize the attributes of the given matrices such as the rows and columns.
 *
 *
 * @author Jacob Sandefur
 * @version 3/2/2020
 *
 */
public class Matrix {
    protected int [] [] matrix;

    public Matrix() {

    }

    public Matrix(int[][] m) {
        getMatrix(m);
        this.setMatrix(m);
    }

    public int[][] getMatrix(int[][] m) {
        return m;
    }

    public void setMatrix(int[][] m) {
        this.matrix = m;
    }
}
