package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;


public class OppgaveB2 {
	public static void main(String[] args) {
		int bredde = lesInnTall("Bredde: ");
		int hoyde = lesInnTall("Høyde:");

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		int tall = parseInt(showInputDialog(message));
		return tall;
	}
}
