package sk.fflch.mathstuff.matrixcalculator;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Math! Now go and die you piece of shit!");
		int[][] matrixA = { { 1, 2 }, { 3, 4 }, { 2, 1 } };
		int[][] matrixB = { { 2, 4 }, { -5, 6 }, { -2, 0 } };

		int[][] matrixC = UltimateMatrixCalculator
				.addMatrices(matrixA, matrixB);
		System.out.println(Arrays.deepToString(matrixC).replaceAll("],",
				"],\r\n"));

	}

}
