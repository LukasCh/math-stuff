package sk.fflch.mathstuff.matrixcalculator;

public class UltimateMatrixCalculator {

	public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
		int[][] result = null;

		if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
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

	public static int[][] subMatrices(int[][] matrixA, int[][] matrixB) {
		int[][] result = null;

		if (matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
			result = new int[matrixA.length][matrixA[0].length];
			for (int x = 0; x < matrixA.length; x++) {
				for (int y = 0; y < matrixA[x].length; y++) {
					result[x][y] = matrixA[x][y] - matrixB[x][y];
					// System.out.println(x+" "+y);
				}
			}
		} else {
			System.out.println("matice musia mat rovnaku velkost ty retard..");
		}
		return result;

	}

	public static int[][] mulMatrix(int[][] matrix, int i) {
		int[][] result = new int[matrix.length][matrix[0].length];
		for (int x = 0; x < result.length; x++) {
			for (int y = 0; y < result[x].length; y++) {
				result[x][y] = matrix[x][y] * i;
			}
		}

		return result;

	}

	public static int[][] mulMatrices(int[][] matrixA, int[][] matrixB) {
		int[][] result = new int[matrixA.length][matrixB[0].length];
		if (matrixA.length == matrixB[0].length && matrixA[0].length == matrixB.length) {
			for (int x = 0; x < result.length; x++) {
				for (int y = 0; y < result[x].length; y++) {
					int dotProduct = 0;
					for (int z = 0; z < matrixA[x].length; z++) {
						dotProduct = dotProduct + matrixA[x][z] * matrixB[z][y];
					}

					result[x][y] = dotProduct;
				}
			}

		} else {
			System.out.println("Sa uvedom nemoze to tak byt... skoc z okna prosim ta");
		}
		return result;

	}
}
