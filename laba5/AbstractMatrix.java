package laba5;


public abstract class AbstractMatrix implements IMatrix {
    protected int n;
    protected int m;

    protected AbstractMatrix(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public AbstractMatrix sum(AbstractMatrix AbstractMatrix) {
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp = this.getElement(i, j) + AbstractMatrix.getElement(i, j);
                this.setElement(i, j, tmp);
            }
        }
        return this;
    }

    public final int getRowSize() {
        return n;
    }

    public final int getColumnSize() {
        return m;
    }

    public String toString() {
    
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < n; i++) {
            str.append("[ ");
            for(int j = 0; j < m; j++) {
                str.append(getElement(i, j));
                str.append(" ");
            }
            str.append(" ]\n");
        }
        return str.toString();
    }



    public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		 if (!(obj instanceof AbstractMatrix))
           		return false;

        AbstractMatrix other = (AbstractMatrix) obj;
		if ((this.n != other.n) || (this.m != other.m))
			return false;

		for(int i = 0; i < this.m; i++) {
			for(int j = 0; j< this.n; j++) {
				if(this.getElement(i, j) != other.getElement(i, j))
					return false;
			}
		}
		return true;
	}
}
