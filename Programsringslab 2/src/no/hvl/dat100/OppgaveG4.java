package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveG4 {
	
	public static void main(String[]args) {
		String aTxt = showInputDialog("Gi tall a: ");
		String bTxt = showInputDialog("Gi tall B: ");
		
		int a = parseInt(aTxt);
		int b = parseInt(bTxt);
		
		showMessageDialog(null, a/b);
		
	}

}
