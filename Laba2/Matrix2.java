public class Matrix2 {

        private int N;
        private int M;
        private int[][] matrix;
    
    
        Matrix2(int N, int M){
            this.N = N;
            this.M = M;
    
            matrix = new int[N][M];
    
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    
        public void setElement(int row, int column, int value) {
            matrix[row][column] = value;
        }
    
        public int getElement(int row, int column) {
            return matrix[row][column];
        }
    
        public Matrix2 sum() {
            Matrix2 res = new Matrix2(N, M);
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    res.setElement(i, j, getElement(i, j) + m.getElement(i, j));
                }
            }
            return res;
        }
    
        Matrix2 product(Matrix2 matrix) {
            Matrix2 prod_m = new Matrix2(N, M);
            int value;
    
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    value = 0;
                    for(int k=0; k < M; k++){
                        value += getElement(i, k) * matrix.getElement(k, j);
                    }
                    prod_m.setElement(i, j, value);
                }
            }
            return prod_m;
        }
    
        public String toString() {
    
            StringBuilder str = new StringBuilder();
    
            for(int i = 0; i < N; i++) {
                str.append("[ ");
                for(int j = 0; j < M; j++) {
                    str.append(getElement(i, j));
                    str.append(" ");
                }
                str.append(" ]\n");
            }
            return str.toString();
        }
    
}
