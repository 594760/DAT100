package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveV1D1 {
	
	public static void main(String[]args) {
		String tall1Txt = showInputDialog("Første tall: ");
		String tall2Txt = showInputDialog("Andre tall: ");
		String tall3Txt = showInputDialog("Tredje tall: ");
		
		int tall1 = Integer.parseInt(tall1Txt);
		int tall2 = Integer.parseInt(tall2Txt);
		int tall3 = Integer.parseInt(tall3Txt);
		
		if (tall1 > tall2 && tall1 > tall3) {
			if (tall2 > tall3) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall3 + ", " + tall2 + ", " + tall1);
			}
			if (tall3 > tall2) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall2 + ", " + tall3 + ", " + tall1);
			}
		}
		if (tall2 >= tall1 && tall2 >= tall3) {
			if (tall1 > tall3) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall3 + ", " + tall1 + ", " + tall2);			
			}
			if (tall3 > tall1) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall1 + ", " + tall2 + ", " + tall3);
			}
			
		}	
		if (tall3 >= tall1 && tall3 >= tall2) {
			if (tall1 > tall2) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall2 + ", " + tall1 + ", " + tall3);			
			}
			if (tall2 > tall1) {
				showMessageDialog(null, "Tallene i stigende rekkefølge: " + tall1 + ", " + tall2 + ", " + tall3);
			}
		}

	}
}
