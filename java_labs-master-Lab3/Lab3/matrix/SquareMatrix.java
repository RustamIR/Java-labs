package matrix;

import exception.MyExceptionClass;

public final class SquareMatrix extends Matrix {

	public SquareMatrix(int size) {
		super(size,size);
		int n = size;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					this.matrix[i][j]=1;
				} else {
					this.matrix[i][j]=0;
				}
			}
		}
	}
	
	public SquareMatrix sum(SquareMatrix squareMatrixAddend) { 
		if (row != squareMatrixAddend.row && column != squareMatrixAddend.column) {
			throw new MyExceptionClass(":( These unit matrixes are of different sizes, they cannnot be summed!");
		} else {
			SquareMatrix squareMatrixSum = new SquareMatrix(row);
			int n = row;
			for (int i = 0; i<n; i++) {
				for (int j = 0; j<n; j++) {
					squareMatrixSum.matrix[i][j] += squareMatrixAddend.matrix[i][j]+this.matrix[i][j];
				}
			}
			return squareMatrixSum;
		}
	}
}