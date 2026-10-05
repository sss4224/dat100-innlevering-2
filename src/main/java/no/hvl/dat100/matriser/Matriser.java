package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	public static void main(String[] args){

		int[][] matriseHeltall = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] matriseHeltall2 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		System.out.println("Oppgave 1");
		skrivUt(matriseHeltall);

		System.out.println("Oppgave 2");
		System.out.println(tilStreng(matriseHeltall));

		System.out.println("Oppgave 3");
		System.out.println(Arrays.deepToString(skaler(2, matriseHeltall)));

		System.out.println("Oppgave 4");
		System.out.println(erLik(matriseHeltall, matriseHeltall2));
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

		String resultat = "";

		for(int i = 0; i < matrise.length; i++){
			String radString = Arrays.toString(matrise[i]);

			radString = radString.replace("[", "").replace("]", "").replace(",", "");

			resultat += radString + "\n";
		}

		return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int row = matrise.length;
		int col = matrise[0].length;

		int[][] newMatrise = new int[row][col];

		for(int i = 0; i < matrise.length; i++){
			for(int j = 0; j < matrise[i].length; j++){
				newMatrise[i][j] = matrise[i][j] * tall;
				System.out.println(newMatrise[i][j]);
			}
		}

		return newMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length){
			return false;
		}

		for(int i = 0; i < a.length; i++){
			if(a[i].length != a[i].length){
				return false;
			}
			for(int j = 0; j < a[i].length; j++){
				if(a[i][j] != b[i][j]){
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
