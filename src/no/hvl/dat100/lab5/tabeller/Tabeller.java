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

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

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

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
