package no.hvl.dat100;

public class OppgaveG1H {
	public static void main(String[] args) {
		int[] tabell = {1, 3, 4, 7, 9, 10};
		skrivUt(tabell);
		System.out.println(finnes(tabell, 3));
		int[] nyTabell = skifteForteng(tabell);
		
		for (int name: nyTabell)
			System.out.println(name);
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
	public static int [] skifteForteng(int [] tabell) {
		
		int[] nyTabell = new int [tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[i] * (-1);
		}
		
		
		return nyTabell;
	}
	}
