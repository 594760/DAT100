package no.hvl.dat100;

public class OppgaveG1G {
	public static void main(String[] args) {
		int[] tabell = {1, 3, 4, 7, 9, 10};
		skrivUt(tabell);
		System.out.println(finnes(tabell, 3));
	}	
		
				
	public static void skrivUt(int [] tab) {
		for (int name : tab) {
			System.out.println(name);
		}
	}
	
	
	public static boolean finnes(int [] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if (tabell[i] == tall)
				return true;
			i++;
			}
		return false;
		}
	}