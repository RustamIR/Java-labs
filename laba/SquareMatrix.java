package matrixes;
import exceptions.*;
public class SquareMatrix extends Matrix{

	public SquareMatrix(int size) {
		super(size, size);
		for(int i = 0; i < size; i++) {
			mtx[i][i] = 1;
		}
	}

	public 	Matrix sum(Matrix m) throws SumMatrixException{
		if ((width != m.width) || (height != m.height)) {
			throw new SumMatrixException("The sizes of matrixes are different. They cannot be summed.");
		}
		SquareMatrix res = new SquareMatrix(width);
		for(int i = 0; i < width; i++) {
			for(int j = i; j < width; j++) {
				res.setElement(i, j, this.getElement(i, j) + m.getElement(i, j));
				if(i != j) {
				res.setElement(j, i, this.getElement(j, i) + m.getElement(j, i));
				}
			}
		}
		return res;
	}


}
	