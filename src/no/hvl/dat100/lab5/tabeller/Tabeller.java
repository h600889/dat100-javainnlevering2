package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.println(i);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tabellStr = "[";
		for (int i = 0; i<tabell.length; i++) {
			if (i >= tabell.length-1) {
				tabellStr += tabell[i];
			} else {
				tabellStr += tabell[i] + ",";
			}
		}
		return tabellStr + "]";
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall)
			return i;
		}
			return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversertTab = new int[tabell.length];
		int pos = tabell.length-1;
		for (int i : tabell) {
			reversertTab[pos] = i;
			pos--;
		}
		return reversertTab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean stigende = true;
		for (int i = 0; i < tabell.length-1; i++) {
			
			if (tabell[i] > tabell[i+1]) {
				stigende = false;
			}	
		}
			return stigende;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde = tabell1.length + tabell2.length;
		int[] nyTab = new int[lengde];
		int pos = 0;
		
		for (int i : tabell1) {
			nyTab[pos] = i;
			pos++;
		}
		
		for (int i : tabell2) {
			nyTab[pos] = i;
			pos++;
		}
		
		for (int i = 0; i < nyTab.length; i++) {		
		}
		return nyTab;
	}
}
