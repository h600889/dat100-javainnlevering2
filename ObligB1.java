package no.hvl.dat100;

public class ObligB1 {

	public static void main(String[] args) {

		int[][]mat1 = { {1, 3, 4}, {2, 5, 7}, {2, 7, 9} }; 	
		int[][]mat2 = { {1, 3, 4}, {2, 5, 7}, {2, 7, 9} };	
		for(int i = 0; i<mat1.length;i++) {
		for(int j = 0; j<mat1[i].length;j++) {
			System.out.print(mat1[i][j] + " ");
		}
		for(int k = 0; k<mat2.length;k++) {
		for(int p = 0; p<mat2[k].length;p++) {
				System.out.print(mat2[k][p] + " ");
			}
		}
	}

	}
	 public static boolean erLik(int[][] mat1, int[][] mat2) {
	
		if(mat1 == mat2) {
			return true;
			
		} else {
			return false;
			
		}
		
	}
	
 	}