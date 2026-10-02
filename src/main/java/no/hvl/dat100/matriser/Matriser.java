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
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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
