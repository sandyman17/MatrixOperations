public class Test1 {

    public static void main(String [] args) {

        System.out.println("Testing Matrix class");
        int[][] test = { { -1, 9 }, { 13, 6 } };
        Matrix matrix  = new Matrix(test);


        System.out.println("Row 1, Element 1: " + matrix.matrix[0][0]);
        System.out.println("Row 1, Element 2: " + matrix.matrix[0][1]);
        System.out.println("Row 2, Element 1: " + matrix.matrix[1][0]);
        System.out.println("Row 2, Element 2: " + matrix.matrix[1][1]);

    }

}
