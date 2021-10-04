package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] j : matrise) {
			for (int i : j) {
				System.out.println(i);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseStr = "";
		for (int[] j : matrise) {
			for (int i : j) {
				matriseStr += i + " ";
			}
			matriseStr += "\n";
		}
		return matriseStr;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] matriseSkalert = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseSkalert[i][j] = matrise[i][j] * tall;
			}
		}
		return matriseSkalert;
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		if(mat1 == mat2) {
			return true;

		} else {
			return false;

		}
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] speileMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				speileMatrise[j][i] = matrise[i][j];
			}
		}
		return speileMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisertMatrise = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < b.length; k++) {
					multiplisertMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}


		return multiplisertMatrise;
	}
}
