package laba5;


public abstract class AbstractMatrix implements IMatrix {
    protected int n;
    protected int m;

    public AbstractMatrix(int n, int m) {
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
        String str = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str += this.getElement(i, j) + " ";
            }
            str += "\n";
        }

        return str;
    }

    // public boolean equals(AbstractMatrix AbstractMatrix) {
    //     if (this.n != AbstractMatrix.getRowSize() && this.m != AbstractMatrix.getColumnSize())
    //         return false;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (this.getElement(i, j) != AbstractMatrix.getElement(i, j))
    //                 return false;
    //         }
    //     }

    //     return true;
    // }

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
