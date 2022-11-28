import exception.MyExceptionClass;
import matrix.SquareMatrix;
import matrix.Matrix;
import java.util.Scanner;

public class Lab3 {
	
	public static void main(String[] args) {
	System.out.println("Select the required option:");
	System.out.println("1 - Create a matrix");
	System.out.println("2 - Create a unit matrix");
	System.out.println("3 - Check the sum");
	System.out.println("4 - Calculate the product of matrixes");
	System.out.println("5 - Calculate the product of unit matrixes");
	System.out.println("6 - Check the Set");
	System.out.println("7 - Check the Get");
	System.out.println("8 - Check if matrixes are equals");
	Scanner sc = new Scanner(System.in);
	String x = sc.nextLine();
	
	boolean value1 = x.contains("1");
	if (value1 == true) {
		System.out.println("Specify the matrix size");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix m = new Matrix(r,c);
		System.out.println(m);
	}
	
	boolean value2 = x.contains("2");
	if (value2 == true) {
		System.out.println("Specify the matrix size");
		int n = sc.nextInt();
		SquareMatrix u = new SquareMatrix(n);
		System.out.println(u);
	}
	
	boolean value3 = x.contains("3");
	if (value3 == true) {
		System.out.println("Specify the size of matrix #1");
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		Matrix a = new Matrix(n11,n12);
		a.fill();
		System.out.println(a);
		System.out.println("Specify the size of matrix #2");
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		Matrix b = new Matrix(n21,n22);
		b.fill();
		System.out.println(b);
		try {
			System.out.println(a.sum(b));
		} catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
	boolean value4 = x.contains("4");
	if (value4 == true) {
		System.out.println("Specify the size of matrix #1");
		int n11 = sc.nextInt();
		int n12 = sc.nextInt();
		Matrix a = new Matrix(n11,n12);
		a.fill();
		System.out.println(a);
		System.out.println("Specify the size of matrix #2");
		int n21 = sc.nextInt();
		int n22 = sc.nextInt();
		Matrix b = new Matrix(n21,n22);
		b.fill();
		System.out.println(b);
		try {
            System.out.println(a.product(b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
	boolean value5 = x.contains("5");
	if (value5 == true) {
		System.out.println("Specify the size of matrix #1");
		int n1 = sc.nextInt();
		SquareMatrix a = new SquareMatrix(n1);
		a.fill();
		System.out.println(a);
		System.out.println("Specify the size of matrix #2");
		int n2 = sc.nextInt();
		SquareMatrix b = new SquareMatrix(n2);
		b.fill();
		System.out.println(b);
		try {
            System.out.println(a.product(b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
	
	boolean value6 = x.contains("6");
	if (value6 == true) {
		System.out.println("Specify the size of matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix a = new Matrix(r,c);
		a.fill();
		System.out.println(a);
		System.out.println("Specify the coordinates and its new value"); 
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int val = sc.nextInt();
		try {
			a.setElement(r1-1,c1-1,val);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
			System.out.println(a);
		}
		
	boolean value7 = x.contains("7");
	if (value7 == true) {	
		System.out.println("Specify the size of matrix");
		int r = sc.nextInt();
		int c = sc.nextInt();
		Matrix a = new Matrix(r,c);
		a.fill();
		System.out.println(a);
		System.out.println("Specify the coordinates of value you want to get");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		try {
			System.out.println(a.getElement(r1-1,c1-1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			}
	}
	
	boolean value8 = x.contains("8");
	if (value8 == true) {
		SquareMatrix m1 = new SquareMatrix(4);
		m1.fill();
		System.out.println(m1);
		SquareMatrix m2 = new SquareMatrix(4);
		m2.fill();
		System.out.println(m2);
		if (m1.equals(m2)) {
			System.out.println("They're equal");
		} else {
			System.out.println("They're not equal");
		}
	}
}
}