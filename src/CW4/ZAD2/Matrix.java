package CW4.ZAD2;

public class Matrix {
    private int[][] matrix;
    private static int[][] tmpMatrix;
    private static int nextEmptyRow = 0;

    private Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    private Matrix(Matrix matrix) {
        this.matrix = Matrix.cloneMatrix(matrix);
    }

    public void print() {
        for (int[] row : this.matrix) {
            System.out.print("| ");
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println("|");
        }
    }

    public static void setUpMatrix(int rowCount, int columnCount) {
        Matrix.tmpMatrix = new int[rowCount][columnCount];
    }

    public static void insertRow(int[] row) {
        Matrix.tmpMatrix[Matrix.nextEmptyRow++] = row;
    }

    public static Matrix create() {
        Matrix newMatrix = new Matrix(Matrix.tmpMatrix);
        Matrix.tmpMatrix = null;
        Matrix.nextEmptyRow = 0;
        return newMatrix;
    }

    private static int[][] cloneMatrix(Matrix source){
        int[][] newMatrix = new int[source.matrix.length][];
        for (int i = 0; i < newMatrix.length; i++) {
            newMatrix[i] = source.matrix[i].clone();
        }
        return newMatrix;
    }

    public Matrix add(Matrix addMatrix) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = this.matrix[i][j] + addMatrix.matrix[i][j];
            }
        }
        return this;
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        Matrix resultMatrix = new Matrix(m1);

        for (int i = 0; i < m1.matrix.length; i++) {
            for (int j = 0; j < m1.matrix[i].length; j++) {
                resultMatrix.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
            }
        }

        return resultMatrix;
    }

    public Matrix subtract(Matrix subMatrix) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = this.matrix[i][j] - subMatrix.matrix[i][j];
            }
        }
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2) {
        Matrix resultMatrix = new Matrix(m1);

        for (int i = 0; i < m1.matrix.length; i++) {
            for (int j = 0; j < m1.matrix[i].length; j++) {
                resultMatrix.matrix[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
            }
        }

        return resultMatrix;
    }

    public Matrix multiply(Matrix mulMatrix) {
        int resultMatrix[][] = Matrix.cloneMatrix(this);

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < this.matrix.length; k++) {
                    resultMatrix[i][j] += this.matrix[i][k] * mulMatrix.matrix[k][j];
                }
            }
        }
        this.matrix = resultMatrix;
        return this;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        Matrix resultMatrix = new Matrix(m1);


        for (int i = 0; i < m1.matrix.length; i++) {
            for (int j = 0; j < m1.matrix[i].length; j++) {
                resultMatrix.matrix[i][j] = 0;
                for (int k = 0; k < m1.matrix.length; k++) {
                    resultMatrix.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }
        return resultMatrix;
    }


}
