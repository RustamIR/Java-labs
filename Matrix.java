// package matrix;


// public class Matrix {
//     public static void main(String args[]){
//         Matrix4 matrix = new Matrix4();

//         System.out.println(matrix);
//     }
// }

// public class Matrix4 {

//     private final int rows;
//     private final int columns;
//     private int[][] matrix;

//     /****************** Constructors ******************/
//     public Matrix4() {
//         this.rows    = 1;
//         this.columns = 1;
//         this.matrix  = new int[rows][columns];
//     }

//     public Matrix4(int rows, int columns) throws MatrixException {

//         if(rows <= 0 || columns <= 0) {
//             throw new MatrixException("Заданы неверные размеры матрицы");
//         }

//         this.rows    = rows;
//         this.columns = columns;
//         this.matrix  = new int[rows][columns];
//     }

//     public Matrix4(int size) throws MatrixException {
//         if(size <= 0) {
//             throw new MatrixException("Заданы неверные размеры матрицы");
//         }

//         this.rows = this.columns = size;
//         this.matrix = new int[size][size];
//     }

//     public Matrix4(int[][] matrix) {
//         this.rows    = matrix.length;
//         this.columns = matrix[0].length;
//         this.matrix  = matrix;
//     }
//     /************************************************************************/

//     public static final Matrix4 sum(Matrix4 matrix1, Matrix4 matrix2) throws MatrixException {

//         if(!check(matrix1, matrix2, false)) {
//             throw new MatrixException("Размеры матриц не совпадают");
//         }
//         else {

//             int size;

//             if(!matrix1.checkSquare()) {
//                 size = matrix1.rows > matrix1.columns ? matrix1.columns : matrix1.rows;
//             }
//             else {
//                 size = matrix1.rows;
//             }

//             Matrix4 matrix = new Matrix4(size);

//             for(int i = 0; i < matrix1.rows; i++) {
//                 for(int j = 0; j < matrix1.columns; j++) {
//                     matrix.matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
//                 }
//             }

//             return matrix;
//         }
//     }

//     public static final Matrix4 multiply(Matrix4 matrix1, Matrix4 matrix2) throws MatrixException {

//         if(!check(matrix1, matrix2, true)) {
//             throw new MatrixException("Размеры матриц не совпадают");
//         }
//         else {

//             int size;
//             int n;

//             if(!matrix1.checkSquare()) {
//                 size = matrix1.rows > matrix1.columns ? matrix1.columns : matrix1.rows;
//                 n = matrix1.rows > matrix1.columns ? matrix1.rows : matrix1.columns;
//             }
//             else {
//                 size = matrix1.rows;
//                 n = matrix1.rows;
//             }

//             Matrix4 matrix = new Matrix4(size);
//             matrix.fill(0);

//             for(int i = 0; i < size; i++) {
//                 for(int j = 0; j < size; j++) {
//                     for(int k = 0; k < n; k++) {
//                         matrix.matrix[i][j] += matrix1.matrix[i][k]*matrix2.matrix[k][j];
//                     }
//                 }
//             }

//             return matrix;
//         }
//     }

//     public final void print() {

//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < columns; j++) {
//                System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public final void fill(int number) {

//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < columns; j++) {
//                 matrix[i][j] = 0;
//             }
//         }
//     }

//     private final static boolean check(Matrix4 matrix1, Matrix4 matrix2, boolean forMultiply) {
//         if(forMultiply) {
//             return ((matrix1.rows == matrix2.rows) && (matrix1.columns == matrix2.columns)) ||
//                     (matrix1.columns == matrix2.rows);
//         }
//         else {
//             return (matrix1.rows == matrix2.rows) && (matrix1.columns == matrix2.columns);
//         }
//     }

//     public final boolean checkSquare() {
//         return rows == columns;
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



