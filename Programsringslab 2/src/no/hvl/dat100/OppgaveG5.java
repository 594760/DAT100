package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG5 {
	
	public static void main(String[]args) {
		
		String tallTxt  = showInputDialog("Gi et tall: ");
		
		int tall = parseInt(tallTxt);
		
		for (int i = 1; i < 6; i++) {
			showMessageDialog(null, tall + " " + i);
		}
		
	}

}
