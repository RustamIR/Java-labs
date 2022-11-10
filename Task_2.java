// import static java.lang.System.out;
// import java.util.Scanner;
// import java.util.Arrays;

// class Task_2 {
//     public static void main(String args[]) {
//         int N;
//         int M;
//         Scanner scanner = new Scanner(System.in);
//         out.println("Введите размерность единичной матрицы");
//         N = scanner.nextInt();
//         M = scanner.nextInt();
//         MyMatrix matrix = new MyMatrix(N, M);
//         out.println("Единичная матрица");
//         out.println(matrix);

//         MyMatrix matrix2 = new MyMatrix(2, 2);
//         out.println("Единичная матрица");
//         matrix2.setElement(0, 0, 1);
//         matrix2.setElement(1, 0, 0);
//         matrix2.setElement(0, 1, 0);
//         matrix2.setElement(1, 1, 1);

//         out.println(matrix2);


//         matrix2.setElement(0, 0, 1);
//         matrix2.setElement(1, 0, 1);
//         matrix2.setElement(0, 1, 1);
//         matrix2.setElement(1, 1, 0);

//         out.println("Модифицированная матрица");
//         out.println(matrix2);

//         MyMatrix copy = new MyMatrix(2, 2);
//         copy = copy.product(matrix2);
// 		for(int i = 0; i < 10; i++) {
// 			matrix = matrix2.product(copy);
// 			System.out.println("matrix^" + (i + 1) + ": \n" + matrix.toString());
// 		}

//     }   
    
// }


// class MyMatrix{
//     Scanner scanner = new Scanner(System.in);
//     private int N;
//     private int M;
//     private int[][] matrix;


//     MyMatrix(int N, int M){
//         this.N = N;
//         this.M = M;

//         matrix = new int[N][M];

//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < M; j++) {
//                 // matrix[i][j] = scanner.nextInt(); ;
//                 if (i == j) {
//                     matrix[i][j] = 1;
//                 } else {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public void setElement(int row, int column, int value) {
// 		matrix[row][column] = value;
// 	}

// 	public int getElement(int row, int column) {
// 		return matrix[row][column];
// 	}

//     MyMatrix sum(MyMatrix matrix){
//         MyMatrix sum_m = new MyMatrix(N, M);

//         for (int i = 0; i < N; i++){
//             for (int j = 0; j < M; j++){
//                 sum_m[i][j] = this.matrix[i][j] + matrix.getElement(i, j); 
//             }
//         }
//         return sum_m;
//     }

//     MyMatrix product(MyMatrix matrix) {
//         MyMatrix prod_m = new MyMatrix(N, M);
//         int value;

//         for(int i = 0; i < N; i++) {
// 			for(int j = 0; j < M; j++) {
//                 value = 0;
//                 for(int k=0; k < M; k++){
//                     value += getElement(i, k) * matrix.getElement(k, j);
//                 }
//                 prod_m.setElement(i, j, value);
//             }
//         }
//         return prod_m;
//     }

//     public String toString() {
//         String str = "";
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < M; j++) {
//                 str += this.matrix[i][j] + " ";
//             }
//             str += "\n";
//         }
//         return str;
//     }
// }