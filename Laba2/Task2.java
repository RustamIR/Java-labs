import static java.lang.System.out;

import Matrix2;


class Task2 {
    public static void main(String args[]) {
        Matrix2 matrix = new Matrix2(3, 3);
        out.println("Единичная матрица");
        out.println(matrix);

        Matrix2 matrix2 = new Matrix2(2, 2); 
        out.println("Единичная матрица");
        matrix2.setElement(0, 0, 1);
        matrix2.setElement(1, 0, 0);
        matrix2.setElement(0, 1, 0);
        matrix2.setElement(1, 1, 1);

        out.println(matrix2);


        matrix2.setElement(0, 0, 1);
        matrix2.setElement(1, 0, 1);
        matrix2.setElement(0, 1, 1);
        matrix2.setElement(1, 1, 0);

        out.println("Модифицированная матрица");
        out.println(matrix2);

        out.println("Возведение матрицы в степень");
        Matrix2 copy = new Matrix2(2, 2);
        copy = copy.product(matrix2);

		for(int i = 0; i < 10; i++) {
			matrix2 = matrix2.product(copy);
			out.println("matrix^" + (i + 1) + ": \n" + matrix2.toString());
		}
    }
}
