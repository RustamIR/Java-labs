package laba5;

public interface IMatrix {
    public void setElement(int row, int column, int value);

    public int getElement(int row, int column);

    public int getRowSize();

    public int getColumnSize();

    public String toString();
}
