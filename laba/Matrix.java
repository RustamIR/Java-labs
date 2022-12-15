package matrixes;
import exceptions.*;
public class Matrix {
	protected int [][]mtx;
	protected int width;
	protected int height;

	public Matrix(int h, int w) {
		width = w;
		height = h;
		mtx = new int [h][w];
	}
	public int getElement(int row, int column) throws MatrixException{
		if ((row >= height)||(column >= width)||(row < 0)||(column < 0)) {
			throw new MatrixException("The index is out of boundaries of matrix.");
		}
		return mtx[row][column];
	}

	public void setElement(int row, int column, int value) throws MatrixException{
		if ((row >= height)||(column >= width)||(row < 0)||(column < 0)) {
			throw new MatrixException("The index is out of boundaries of matrix.");
		}
		mtx[row][column] = value;
	}

	public Matrix sum(Matrix m) throws SumMatrixException{
		if ((width != m.width)||(height != m.height)) {
			throw new SumMatrixException("The sizes of matrixes are different. They cannot be summed.");
		}
		Matrix res = new Matrix(height, width);
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				res.setElement(i, j, this.getElement(i, j) + m.getElement(i, j));
			}
		}
		return res;
	}

	public Matrix product(Matrix m) throws ProductMatrixException{
		if (width != m.height) {
			throw new ProductMatrixException("The number of rows in the first matrix isn't equal to the number of columns in the second one. They cannot be producted.");
		}
		Matrix res = new Matrix(height, m.width);
		int value;
		 for (int i = 0; i < height; i++) {
 			 
    			for (int j = 0; j < m.width; j++) {
				value = 0;
     				 for (int k = 0; k < width; k++) {
        				value += this.getElement(i, k) * m.getElement(k,j);
				}
				res.setElement(i, j, value);
			}
		}
		return res;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		 if (!(obj instanceof Matrix))
           		return false;
		Matrix other = (Matrix) obj;
		if ((this.width != other.width) || (this.height != other.height))
			return false;
		for(int i = 0; i < this.height; i++) {
			for(int j = 0; j< this.width; j++) {
				if(this.getElement(i, j) != other.getElement(i, j))
					return false;
			}
		}
		return true;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < height; i++) {
			str.append("[ ");
			for(int j = 0; j < width; j++) {
				str.append(getElement(i, j));
				str.append(" ");
			}
			str.append(" ]\n");
		}
		return str.toString();
	}
}
	