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
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
