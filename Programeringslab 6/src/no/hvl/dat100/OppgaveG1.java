package no.hvl.dat100;


public class OppgaveG1 {

	public static void main(String[] args) {
		double [][] obs = {
				{1.4, 1.7, 1.9, 2.0},
				{5.4, 7.8, 9.8, 7.9, 3.0},
				{-1.7, -1.7, -2.8}
		};
		
		skrivUtUFor(obs);
		skrivUt(obs);
		
		System.out.println(obs.length);
		System.out.println("Den skriver ut 3 fordi men obs.length sjekker han hvor mange tabeller det er i flerdimesjonaletabellen.");
		System.out.println();
		
		System.out.println(obs[0].length);
		System.out.println("Den skriver ut 4 fordi men obs[0].length sjekker han hvor mange elementer det er i den første tabellen i flerdimesjonaletabellen.");
		System.out.println();

		System.out.println(obs[1].length);
		System.out.println("Den skriver ut 5 fordi men obs[1].length sjekker han hvor mange elementer det er i den andre tabellen i  flerdimesjonaletabellen.");
		System.out.println();

		System.out.println(obs[2].length);
		System.out.println("Den skriver ut 3 fordi men obs[2].length sjekker han hvor mange elementer det er i den tredje tabellen i flerdimesjonaletabellen.");
		System.out.println();
		
		double limit = 3.3;
		System.out.println(størreEnnLimit(obs, limit));
		System.out.println();
		
		double [][] obs2 = rekkefølgeTabell(obs);
		skrivUt(obs2);
	}
	public static void skrivUt(double [][] tabell) {
		System.out.println("Skriver ut ved hjelp av for løkker");
		for(int i = 0; i < tabell.length; i++) {
			for(int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void skrivUtUFor(double [][] tabell) {
		System.out.println("Skriver ut ved hjelp av Utividt For løkker:");
		for (double [] i : tabell) {
			for(double j : i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean størreEnnLimit(double [][] obs, double limit) {
		for (double [] i : obs) {
			for(double j : i) {
				if (j > limit) {
					return true;
				}
					
			}
		}	
		return false;
	}
	 
	public static double [][] rekkefølgeTabell(double [][] tab) {
		double [][] nyTab = new double[tab.length][];
		int j = tab.length-1;
		for(int i = 0; i < tab.length; i++) {
			nyTab[i] = tab[j];
			j--;
		}
		return nyTab;
	}
}
