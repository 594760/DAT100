package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;


public class OppgaveB2A {
	public static void main(String[] args) {
		int tall = lesInnTall(showInputDialog("Tall: "));
		showMessageDialog(null, tall);
		
		String breddeStr = showInputDialog("Bredde:");
		int bredde = parseInt(breddeStr);

		String hoydeStr = showInputDialog("Høyde:");
		int hoyde = parseInt(hoydeStr);

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	private static int lesInnTall(String message) {
		int tall = parseInt(message);
		return tall;
	}
}
