package sk.fflch.mathstuff.matrixcalculator;

public class UltimateMatrixCalculator {

	public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
		int[][] result = null;
		System.out.println(matrixA.length + " " + matrixA[0].length);
		System.out.println(matrixB.length + " " + matrixB[0].length);

		if (matrixA.length == matrixB.length
				&& matrixA[0].length == matrixB[0].length) {
			result = new int[matrixA.length][matrixA[0].length];
			for (int x = 0; x < matrixA.length; x++) {
				for (int y = 0; y < matrixA[x].length; y++) {
					result[x][y] = matrixA[x][y] + matrixB[x][y];
					// System.out.println(x+" "+y);
				}
			}
		} else {
			System.out.println("matice musia mat rovnaku velkost ty retard..");
		}
		return result;
	}
}
