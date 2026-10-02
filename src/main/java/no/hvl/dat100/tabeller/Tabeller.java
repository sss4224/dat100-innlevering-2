package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	public static void main(String[] args){
		int[] heltall = {1,2,3,4};

		System.out.println("Oppgave 1");
		skrivUt(heltall);

		System.out.println("Oppgave 2");
		System.out.println(tilStreng(heltall));

		System.out.println("Oppgave 3");
		System.out.println(summer(heltall));

		System.out.println("Oppgave 4");
		System.out.println(finnesTall(heltall, 4));
	}

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i < tabell.length; i++){
			System.out.println(tabell[i]);
		}

	}	

	// b)
	public static String tilStreng(int[] tabell) {

		String newString = Arrays.toString(tabell).replaceAll("\\s", "");
		return newString;

	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int i = 0; i < tabell.length; i++){
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++){
			if(tabell[i] == tall){
				return true;
			}
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
