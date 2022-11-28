package matrix;

import exception.MyExceptionClass;

public final class OneColumnMatrix extends Matrix { // доп. задание!!
	
	public OneColumnMatrix(int r, int c) {
		super(r, 1); 
		column = c;
		}
	
	public int getElement(int row, int column){
		return super.getElement(row, 0);
		}
	
	public void setElement(int row, int column, int value) {
		super.setElement(row, 0, (int)(Math.random()*10));
		}
}

