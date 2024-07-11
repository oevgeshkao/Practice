package TaskTree;

public class Matrix {
    private final double[][] matrix;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    public void setValue(int row, int col, double value) {
        matrix[row][col] = value;
    }

    private double getValue(int row, int col) {
        return matrix[row][col];
    }

    public Matrix sum(Matrix m) {
        Matrix newMatrix = new Matrix(rows, m.columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newMatrix.setValue(i, j, matrix[i][j] + m.getValue(i, j));
            }
        }
        return newMatrix;
    }

    public void multiplyByNum(double val) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] *= val;
            }
        }
    }

    public Matrix multiplyMatrix(Matrix m) {

        Matrix result = new Matrix(rows, m.columns);
        double val = 0;

        for (int i = 0; i < rows; i++) {
            for (int g = 0; g < rows; g++) {
                val = 0;

                for (int j = 0; j < columns; j++) {
                    val += matrix[i][j] * m.getValue(j, g);
                }

                result.setValue(i, g, val);
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
