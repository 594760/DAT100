package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveG4 {
	
	public static void main(String[]args) {
				
		for (int i = 1; i < 6; i++) {
			int tall  = Integer.parseInt(showInputDialog("Gi et tall: "));
			showMessageDialog(null, "Tallet er: " + tall + " " + "Runde: " + i);
			System.out.println(tall);
		}
		
	}

}
