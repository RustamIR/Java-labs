package matrix;

import exception.MyExceptionClass;

public class Matrix {
	
	int row;
	int column;
	int[][] matrix;
	
	public Matrix(int row, int column) {
		this.row = row;
		this.column = column;
		this.matrix = new int[this.row][this.column];
		for (int i=0; i<this.row; i++) {
			for (int j=0; j<this.column; j++) {
				this.setElement(i,j,0);
			}
		}
	}
	
public void fill() {
		for (int i=0; i<this.row; i++) {
			for (int j=0; j<this.column; j++) {
				this.setElement(i,j,(int)(Math.random()*10));
			}
		}
	}

	
	public Matrix sum(Matrix matrixAddend) { 
		if (row != matrixAddend.row || column != matrixAddend.column) {
			throw new MyExceptionClass(":( These matrixes are of different sizes, so we can't sum them!");
		} else {
			Matrix matrixSum = new Matrix(row, column);
			for (int i = 0; i<row; i++) {
				for (int j = 0; j<column; j++) {
					int elm = matrixAddend.getElement(i,j)+this.getElement(i,j);
					matrixSum.setElement(i,j,elm);
					}
				}
				return matrixSum;
		}
	}
	
	
	public Matrix product(Matrix matrixFactor) {
		if (column != matrixFactor.row) {
			throw new MyExceptionClass(":( These matrixes are of different sizes, so we can't multyply them!");
		} else {
			Matrix matrixProduct = new Matrix(row, column);
			for (int i=0; i<row; i++) {
				for (int j=0; j<matrixFactor.column; j++) {
					matrixProduct.setElement(i,j,0);
					for (int k=0; k<column; k++) {
						matrixProduct.setElement(i,j, matrixProduct.getElement(i,j) + (this.getElement(i,k)*matrixFactor.getElement(k,j)));
					}
				}
			}
			return matrixProduct;
		}
	}
	

	public void setElement(int row, int column, int value) { //задание элемента
		if (row >= this.row || column >= this.column) {
			throw new MyExceptionClass(":( Went out of range of the matrix");
		} else {
			this.matrix[row][column] = value;
		}
	}
	
	public int getElement(int row, int column) { //получение элемента
		if (row >= this.row || column >= this.column) {
			throw new MyExceptionClass(":( Went out of range of the matrix");
		} else {
			return this.matrix[row][column];
		}
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<column; j++) {
					str.append(" ").append(getElement(i,j));
				} 
				str.append("\n");
			}
		return str.toString();
	}
	
	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Matrix))
            return false;
        Matrix m = (Matrix) obj; 
        if (row != m.row || column != m.column)
            return false;

        int flag = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (this.getElement(i, j) != m.getElement(i, j))
                    flag++;
            }
        }
        if (flag == 0)
            return true;
        return false;
    }
}