package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveB1 {

	public static void main(String[] args) {
		boolean[][] aud = { { false, true, false, false }, // rad 1
				{ false, false, true, false }, // rad 2
				{ true, false, true, true }, // rad 3
				{ true, true, true, false }, // rad 4
		};

		System.out.println(ledigePlasser(aud));
		
		prosentFullt(aud);
		
		forsteLedigePlassBakkfra(aud);
		forsteLedigePlassFraFront(aud);
		
		
		boolean ledigPlass = hvorVilDuSitte(aud);
		
	}

	public static int ledigePlasser(boolean[][] aud) {
		int antallLedigePlasser = 0;
		for (boolean rad[] : aud) {
			for (boolean plass : rad) {
				if (plass == true) {
					antallLedigePlasser++;
				}
			}
		}
		return antallLedigePlasser;
	}

	public static int plasser(boolean[][] aud) {
		int plasser = 0;
		for (boolean[] rad : aud) {
			plasser += rad.length;
		}
		return plasser;
	}

	public static double prosentFullt(boolean[][] aud) {
		int ledigePlasser = ledigePlasser(aud);
		int totalPlasser = plasser(aud);
		double fultProsetn = ((totalPlasser - ledigePlasser) * (100.0 / totalPlasser));
		System.out.println(fultProsetn);
		return fultProsetn;
	}

	public static String forsteLedigePlassFraFront(boolean[][] aud) {
		String plassering = "";
		for (int i = 0; i < aud.length; i++) {
			for (int j = 0; j < aud[i].length; j++) {
				if (aud[i][j] == true) {
					plassering = "Rad: " + (i+1) + " Plass: " + (j+1);
					break;
				}
			}
			if (plassering != "") {
				break;
			}
		}
		System.out.println(plassering);
		return plassering;
	}

	public static String forsteLedigePlassBakkfra(boolean[][] aud) {
		String plassering = "";
		for (int i = aud.length - 1; i > 0; i--) {
			for (int j = aud[i].length - 1; j > 0; j--) {
				if (aud[i][j] == true) {
					plassering = "Rad: " + (i+1) + " Plass: " + (j+1);
					break;
				}
			}
			if (plassering != "") {
				break;
			}
		}
		System.out.println(plassering);
		return plassering;
	}

	public static boolean hvorVilDuSitte(boolean[][] aud) {
		int rad = parseInt(showInputDialog("Hvilken rad vil du sitte på?"));
		int sete = parseInt(showInputDialog("Hvilket sete vil du sitte på?"));
		rad = rad - 1;
		sete = sete - 1;
		boolean ledigPlass = erPlassenledig(aud, rad, sete);
		skrivUtLP(ledigPlass, rad, sete);
		return ledigPlass;
	}

	public static boolean erPlassenledig(boolean[][] aud, int rad, int sete) {
		if (aud[rad][sete] == true) {
			return true;
		}
		return false;
	}
	
	public static void skrivUtLP(boolean ledigPlass, int rad, int sete) {
		if (ledigPlass) {
			System.out.println("Plassen rad: " + (rad+1) + " sete: " + (sete+1) + " er ledig");
		}
		else {
			System.out.println("Plassen rad: " + (rad+1) + " sete: " + (sete+1) + " er ikke ledig");
		}
	}
}