package sk.fflch.mathstuff.matrixcalculator;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OK *sigh* I'll do the math for you");
		int[][] matrixA = { { 1, 2 }, { 3, 4 }, { 2, 1 } };
		int[][] matrixB = { { 2, 4 }, { -5, 6 }, { -2, 0 } };
		int[][] matrixB2 = { { 3, 6, 4 }, { 7, 2, 1 } };
		System.out.println("adding");
		int[][] matrixC = UltimateMatrixCalculator.addMatrices(matrixA, matrixB);
		System.out.println(Arrays.deepToString(matrixC).replaceAll("],", "],\r\n"));
		System.out.println("substracting");
		int[][] matrixD = UltimateMatrixCalculator.subMatrices(matrixA, matrixB);
		System.out.println(Arrays.deepToString(matrixD).replaceAll("],", "],\r\n"));
		System.out.println("multiply by number");
		int[][] matrixM = UltimateMatrixCalculator.mulMatrix(matrixA, 8);
		System.out.println(Arrays.deepToString(matrixM).replaceAll("],", "],\r\n"));
		System.out.println("multiply matrices");
		int[][] matrixL = UltimateMatrixCalculator.mulMatrices(matrixA, matrixB2);
		System.out.println(Arrays.deepToString(matrixL).replaceAll("],", "],\r\n"));

	}
}
