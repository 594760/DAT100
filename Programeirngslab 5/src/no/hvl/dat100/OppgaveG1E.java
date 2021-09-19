package no.hvl.dat100;

public class OppgaveG1E {
	public static void main(String[] args) {
		int[] tabell = {1, 3, 4, 7, 9, 10};
		skrivUt(tabell);
	}	
		
				
	public static void skrivUt(int [] tab) {
		for (int i=0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}

