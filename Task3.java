import java.util.Scanner;
import static java.lang.System.out;


public class Task3 {
    public static void main(String args[]){
        int N;
        int M;
        Scanner scanner = new Scanner(System.in);
        out.println("Введите размерность первой матрицы");
        N = scanner.nextInt();
        M = scanner.nextInt();
        out.println("Ведите данные матрицы");

        Matrix3 matrix = new Matrix3(N, M);
        out.println("Колличество строк матрицы " + N +" колличество столбцов " + M + ", матрица 1:");
        out.println(matrix);

        out.println("Введите размерность второй матрицы");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        out.println("Ведите данные второй матрицы");

        Matrix3 matrix2 = new Matrix3(A, B);
        out.println("Колличество строк матрицы " + A +" колличество столбцов " + B + ", матрица 2:");

        out.println(matrix2);

        scanner.close();

        // boolean allEqual = true;
        // for (int i = 0; i < N && allEqual; i++) {
        //     for (int j = 0; j < M && allEqual; j++) {
        //         for (int k = 0; k < A && allEqual; k++) {
        //             for (int u = 0; u < B && allEqual; u++) {
        //                 if (matrix[i][j] != matrix2[k][u]) {
        //                     allEqual = false;
        //                 }
        //             }
        //         }
        //     }
        //     System.out.println(allEqual? "All equal" : "Not all equal");
        // }


    }
}


class Matrix3{
    Scanner scanner = new Scanner(System.in);
    private final int N;
    private final int M;
    private int[][] matrix;

    Matrix3(int N, int M){
        this.N = N;
        this.M = M;

        matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // public Matrix3(int N, int M) throws MatrixException {

    //     if(N <= 0 || M <= 0) {
    //         throw new MatrixException("Заданы неверные размеры матрицы");
    //     }

    //     this.N    = N;
    //     this.M = M;
    //     this.matrix  = new int[N][M];
    // }

    public void setElement(int row, int column, int value) {
		matrix[row][column] = value;
	}

	public int getElement(int row, int column) {
		return matrix[row][column];
	}

    Matrix3 product(Matrix3 matrix) {
        Matrix3 prod_m = new Matrix3(N, M);
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
        String str = "";
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                str += this.matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    
}

// class SquareMatrix extends Matrix3{

//     public SquareMatrix(int N, int M, int[][] matrix){
//         public boolean equal(Matrix m) {
//             Matrix3 m = new Matrix3(N, M);
// 		// TODO: Test whether two matrices are equal
// 		// Return true/false
//             for(int r = 0; r != this.N; r++) {
//                 for(int c = 0; c != this.M; c++) {
//                     if (m[N][M] != this.myMatrix[r][c]) return false;
//                 } 
//             }
//             return true;
//         }
//     }
// }


// public class MatrixException extends Exception {

//     private String cause;

//     MatrixException(String cause) {
//         this.cause = cause;
//     }

//     public String cause() {
//         return this.cause;
//     }
// }
