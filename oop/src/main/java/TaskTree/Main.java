package TaskTree;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        matrix1.setValue(0, 0, 2);
        matrix1.setValue(0, 1, 1);
        matrix1.setValue(1, 0, 3);
        matrix1.setValue(1, 1, 1);
        matrix1.setValue(2, 0, 2);
        matrix1.setValue(2, 1, 1);

        System.out.println("******Matrix 1******");
        matrix1.print();

        matrix2.setValue(0, 0, 2);
        matrix2.setValue(0, 1, 1);
        matrix2.setValue(1, 0, 1);
        matrix2.setValue(1, 1, 1);
        matrix2.setValue(2, 0, 2);
        matrix2.setValue(2, 1, 3);

        System.out.println("******Matrix 2******");
        matrix2.print();

        System.out.println("******Multiplying by a number******");
        Matrix newMatrix1 = matrix1.sum(matrix2);
        newMatrix1.print();

        System.out.println("******Multiplying by a matrix******");
        Matrix newMatrix2 = matrix1.multiplyMatrix(matrix2);
        newMatrix2.print();

    }
}


