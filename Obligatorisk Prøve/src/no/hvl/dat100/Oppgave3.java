package no.hvl.dat100;
 
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppgave3 {
	public static void main(String[] args) {
		//Har importet:
		//import static javax.swing.JOptionPane.*;
		//import static java.lang.Integer.parseInt;
		
		int antall = 0;
		int sum = 0;
		int tall = 0;
		
		do {
			String svar = showInputDialog("Tall? (Du avslutter med å skrive 0) ");
			tall = parseInt(svar);
			if (tall != 0) {
				antall++;
				sum += tall;
			}
		} while (tall != 0);
		System.out.println("Antall tall: " + antall);
		System.out.println("sum: " + sum);
		
		
		//dette var det jeg gjorde på prøven:
		/*
		int antallTall = parseInt(showInputDialog("Hvor mange tall skal du ha: "));
		int sum = 0;
		for (int i = 0; i < antallTall; i++) {
			int tall = parseInt(showInputDialog("skriv et tall"));
			sum = sum + tall;
		}
		System.out.println("Antall tall: " + antallTall);
		System.out.println("sum: " + sum);
		*/
	}
}
