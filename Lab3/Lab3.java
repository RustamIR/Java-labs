import exception.MyExceptionClass;
import matrix.SquareMatrix;
import static java.lang.System.out;

import matrix.OneColumnMatrix;
import java.util.Scanner;
import matrix.Matrix;

public class Lab3 {
	
	public static void main(String[] args) {
	out.println("Select the required option:");
	out.println("1 - Create a matrix");
	out.println("2 - Create a unit matrix");
	out.println("3 - Check the sum");
	out.println("4 - Calculate the product of matrixes");
	out.println("5 - Calculate the product of unit matrixes");
	out.println("6 - Check the Set");
	out.println("7 - Check the Get");
	out.println("8 - Check if matrixes are equals");
	out.println("9 - Check if the additional task works");
	Scanner sc = new Scanner(System.in);
	String x = sc.nextLine();
	
	boolean value1 = x.contains("1");
	if (value1 == true) {
		out.println("Specify the matrix size");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix m = new Matrix(r,c);
		out.println(m);
	}
	
	boolean value2 = x.contains("2");
	if (value2 == true) {
		out.println("Specify the matrix size");
		int n = sc.nextInt();
		SquareMatrix u = new SquareMatrix(n);
		out.println(u);
	}
	
	boolean value3 = x.contains("3");
	if (value3 == true) {
		out.println("Specify the size of matrix #1");
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		Matrix a = new Matrix(n11,n12);
		a.fill();
		out.println(a);
		out.println("Specify the size of matrix #2");
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		Matrix b = new Matrix(n21,n22);
		b.fill();
		out.println(b);
		try {
			out.println(a.sum(b));
		} catch (Exception e) {
            out.println(e.getMessage());
        }
	}
	
	boolean value4 = x.contains("4");
	if (value4 == true) {
		out.println("Specify the size of matrix #1");
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		Matrix a = new Matrix(n11,n12);
		a.fill();
		out.println(a);
		out.println("Specify the size of matrix #2");
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		Matrix b = new Matrix(n21,n22);
		b.fill();
		out.println(b);
		try {
            out.println(a.product(b));
        } catch (Exception e) {
            out.println(e.getMessage());
        }
	}
	
	boolean value5 = x.contains("5");
	if (value5 == true) {
		out.println("Specify the size of matrix #1");
		int n1 = sc.nextInt();
		SquareMatrix a = new SquareMatrix(n1);
		a.fill();
		out.println(a);
		out.println("Specify the size of matrix #2");
		int n2 = sc.nextInt();
		SquareMatrix b = new SquareMatrix(n2);
		b.fill();
		out.println(b);
		try {
            out.println(a.product(b));
        } catch (Exception e) {
            out.println(e.getMessage());
        }
	}
	
	boolean value6 = x.contains("6");
	if (value6 == true) {
		out.println("Specify the size of matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix a = new Matrix(r,c);
		a.fill();
		out.println(a);
		out.println("Specify the coordinates and its new value"); 
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int val = sc.nextInt();
		try {
			a.setElement(r1-1,c1-1,val);
		} catch (Exception e) {
			out.println(e.getMessage());
			}
			out.println(a);
		}
		
	boolean value7 = x.contains("7");
	if (value7 == true) {	
		out.println("Specify the size of matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix a = new Matrix(r,c);
		a.fill();
		out.println(a);
		out.println("Specify the coordinates of value you want to get");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		try {
			out.println(a.getElement(r1-1,c1-1));
		} catch (Exception e) {
			out.println(e.getMessage());
			}
	}
	
	boolean value8 = x.contains("8");
	if (value8 == true) {
		SquareMatrix m1 = new SquareMatrix(4);
		m1.fill();
		out.println(m1);
		SquareMatrix m2 = new SquareMatrix(4);
		m2.fill();
		out.println(m2);
		if (m1.equals(m2)) {
			out.println("They're equal");
		} else {
			out.println("They're not equal");
		}
	}
	
	boolean value9 = x.contains("9");
	if (value9 == true) {
		out.println("Specify the size of matrix #1");
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		OneColumnMatrix a = new OneColumnMatrix(n11,n12);
		out.println(a);
		out.println("Specify the size of matrix #2");
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		Matrix b = new Matrix(n21,n22);
		b.fill();
		out.println(b);
		try {
            out.println(a.sum(b));
        } catch (Exception e) {
            out.println(e.getMessage());
        }
	}
}
}