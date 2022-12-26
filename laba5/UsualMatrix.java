package laba5;


public class UsualMatrix extends AbstractMatrix {
    protected int[][] matrix;

    public UsualMatrix(int n, int m) {
        super(n, m);

        this.matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.setElement(i, j, 0);
            }
        }
    }

    public UsualMatrix product(AbstractMatrix abstractMatrix) {
        UsualMatrix newMatrix = new UsualMatrix(n, abstractMatrix.getColumnSize());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < abstractMatrix.getColumnSize(); j++) {
                int tmp = 0;
                for (int k = 0; k < m; k++) {
                    tmp += this.getElement(i, k) * abstractMatrix.getElement(k, j);
                }
                newMatrix.setElement(i, j, tmp);
            }
        }

        return newMatrix;
    }

    public void setElement(int row, int column, int value) {
        this.matrix[row][column] = value;
    }

    public int getElement(int row, int column) {
        return matrix[row][column];
    }
}
