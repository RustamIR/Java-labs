
import matrixes.*;
import exceptions.*;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		Matrix m1= new Matrix(8, 3), m2 = new Matrix(8, 3);
		
		out.println(m1.equals(m2));

		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 3; j++) {
				m1.setElement(i, j, 1);
				m2.setElement(i, j, i+j);
			}
		}
		
		out.println(m1.equals(m2));
		
		out.println(m1);
		
		out.println(m2);
		try {
			m1 = m1.product(m2);
		}
		catch(ProductMatrixException e) {
			out.println(e);
		}
		out.println("Result of m1*m2: ");
		out.println(m1);
		try {
			m1 = m1.sum(m2);
		}
		catch(SumMatrixException e) {
			out.println(e);
		}
		out.println("Result of m1+m2: ");
		out.println(m1);
		Matrix m4 = new Matrix(3, 8);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 8; j++) {
				m4.setElement(i, j, 1);
			}
		}
		out.println(m4);
		try {
			m1 = m1.product(m4);
		}
		catch(ProductMatrixException e) {
			out.println(e);
		}
		out.println("Result of m1*m4: ");
		out.println(m1);
		Matrix m3 = new Matrix(4, 6);
		try {
			m3 = m1.product(m3);
		}
		catch(ProductMatrixException e) {
			out.println(e);
		}
		out.println("Result of m3*m1: ");
		out.println(m3);
		try {
			m3 = m1.sum(m3);
		}
		catch(SumMatrixException e) {
			out.println(e);
		}
		out.println("Result of m3+m1: ");
		out.println(m3);

		SquareMatrix sm1= new SquareMatrix(3), sm2 = new SquareMatrix(3);
		
		out.println(sm1.equals(sm2));

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				sm1.setElement(i, j, 1);
				sm2.setElement(i, j, i+j);
			}
		}
		
		out.println(sm1.equals(sm2));
		
		out.println(sm1);
		
		out.println(sm2);
		out.println(sm1);
		try {
			sm1 = (SquareMatrix)sm1.sum(sm2);
		}
		catch(SumMatrixException e) {
			out.println(e);
		}
		out.println("Result of sm1+sm2: ");
		out.println(sm1);
		
		SquareMatrix sm3 = new SquareMatrix(4);
		out.println(sm3);
		try {
			sm3 = (SquareMatrix)sm1.sum(sm3);
		}
		catch(SumMatrixException e) {
			out.println(e);
		}
		out.println("Result of sm1+sm3: ");
		out.println(sm3);

		
	}
}
	