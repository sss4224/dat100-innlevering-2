package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

	}
	

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
public static int posisjonTall(int[] tabell, int tall) {
    if (tabell == null) {
        return -1;
    }
    
    for (int i = 0; i < tabell.length; i++) {
        if (tabell[i] == tall) {
            return i;
        }
    }
    
    return -1;
}

	// f)
public static int[] reverser(int[] tabell) {
    int[] nyTabell = new int[tabell.length];
    for (int i = tabell.length - 1, j = 0; i >= 0; i--, j++) {
        nyTabell[j] = tabell[i];
    }
    return nyTabell;
}

	// g)
public static boolean erSortert(int[] tabell) {
    for (int i = 0; i < tabell.length - 1; i++) {
        if (tabell[i] > tabell[i + 1]) {
            return false;
        }
    }
    return true;
}
	// h)
public static int[] settSammen(int[] tabell1, int[] tabell2) {

    int[] merged = new int[tabell1.length + tabell2.length];

    int i = 0;
    for (int j = 0; j < tabell1.length; j++) {
        merged[i] = tabell1[j];
        i++;
    }
    for (int j = 0; j < tabell2.length; j++) {
        merged[i] = tabell2[j];
        i++;
    }

    return merged;
}
}