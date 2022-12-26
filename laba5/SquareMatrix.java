package laba5;

public class SquareMatrix extends UsualMatrix {

    public SquareMatrix(int n, int m) {
        super(n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.setElement(i, j, 1);
            }
        }
    }
}
