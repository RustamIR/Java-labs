package laba5;
import java.util.LinkedList;


public class SparseMatrix extends AbstractMatrix {
    LinkedList<Value> matrixList;

    public SparseMatrix(int n, int m) {
        super(n, m);
        this.matrixList = new LinkedList<Value>();
    }

    public void setElement(int row, int column, int value) {
        Value v = new Value(row, column, value);
        this.matrixList.add(v);
    }

    public int getElement(int row, int column) {
        Value value = new Value(row, column);
        for (Value v : this.matrixList) {
            if (v.equals(value)) {
                return v.k;
            }
        }

        return 0;
    }

    public SparseMatrix product(SparseMatrix abstractMatrix) {
        SparseMatrix newMatrix = new SparseMatrix(n, abstractMatrix.getColumnSize());

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

}


final class Value {
    public int i;
    public int j;
    public int k;

    Value(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    Value(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public boolean equals(Value v) {
        return (this.i == v.i && this.j == v.j);
    }

    public String toString() {
        return String.format("(%d, %d) == %d", this.i, this.j, this.k);
    }
}
