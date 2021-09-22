package no.hvl.dat100;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class OppgaveB4 {
	public static void main(String[] args) {
		double [] temperaturer = temperaturTabbel();
		gjennomsnitOgMaksimum(temperaturer);
		
	}
	
	public static double [] temperaturTabbel() {
		double [] temperaturer = new double[7];
		System.out.println("Analyse av Temperaturer");
		System.out.println("***********************");
		System.out.println("Skriv inn temperaturene: ");
		
		for (int i = 0; i < temperaturer.length; i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.print((i+1) + ". dag: ");
			temperaturer[i] = parseDouble(myObj.nextLine());		
		}
		return temperaturer;	
	}
	
	public static void gjennomsnitOgMaksimum(double [] tab) {
		double maksimum = tab[0];
		double sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum = sum + tab[i];
			if (maksimum < tab[i]) {
				maksimum = tab[i];
			}
		}
		System.out.printf("\n" + "Gjennomsnitstempertauren var %.1f " + "\n", (sum/tab.length));
		System.out.println("Maksimun for denne uken var " + (maksimum) + " grader");
	}
}