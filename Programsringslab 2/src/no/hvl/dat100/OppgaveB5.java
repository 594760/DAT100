package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB5 {
	
	public static void main(String[]args) {
		
		for (int i = 0; i < 2;) {
			
			String poengsumTxt = showInputDialog("Poengsum på prøve: ");
			int poengsum = Integer.parseInt(poengsumTxt);
			char karakter = 'G';
			
			if (poengsum < 40 && poengsum >= 0) {
				karakter = 'F';
			}
			else if (poengsum >= 40 && poengsum < 50) {
				karakter = 'E';
			}
			else if (poengsum >= 50 && poengsum < 60) {
				karakter = 'D';
			}
			else if (poengsum >= 60 && poengsum < 80) {
				karakter = 'C';
			}
			else if (poengsum >= 80 && poengsum < 90) {
				karakter = 'B';
			}
			else if (poengsum >= 90 && poengsum <= 100){
				karakter = 'A';
			}
			else {
				showMessageDialog(null, "Poengsum " + poengsum + " er ugylidg.");
			}
			if (karakter != 'G') {
				showMessageDialog(null, "Med poengsummen " + poengsum + " får du karakteren " + karakter);
				i++;
			}
		}
	}

}
