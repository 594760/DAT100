package no.hvl.dat100;
 
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppgave3 {
	public static void main(String[] args) {
		//Har importet:
		//import static javax.swing.JOptionPane.*;
		//import static java.lang.Integer.parseInt;

		int antallTall = parseInt(showInputDialog("Hvor mange tall skal du ha: "));
		int sum = 0;
		for (int i = 0; i < antallTall; i++) {
			int tall = parseInt(showInputDialog("skriv et tall"));
			sum = sum + tall;
		}
		System.out.println("Antall tall: " + antallTall);
		System.out.println("sum: " + sum);
		
	}
}
