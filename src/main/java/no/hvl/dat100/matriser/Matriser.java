package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args){

		int[][] matriseHeltall = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		System.out.println("Oppgave 1");
		skrivUt(matriseHeltall);

		System.out.println("Oppgave 2");

	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				System.out.println(matrise[i][j]);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
    if (mat1 == null || mat2 == null || mat1.length != mat2.length) {
        return false;
    }

    for (int i = 0; i < mat1.length; i++) {
        if (mat1[i].length != mat2[i].length) {
            return false;
        }
        for (int j = 0; j < mat1[i].length; j++) {
            if (mat1[i][j] != mat2[i][j]) {
                return false;
            }
        }
    }
    return true;
}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
