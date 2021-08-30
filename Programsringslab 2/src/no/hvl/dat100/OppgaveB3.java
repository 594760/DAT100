package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB3 {
	
	public static void main(String[]args) {
		String brukernavn = showInputDialog("Brukernavn:");
		
		String passord = showInputDialog("Passord: ");
		
		String rettBrukernavn = "olav223";
		
		String rettPassord = "1234";
		
		if (brukernavn.equals(rettBrukernavn)) {
			rettBrukernavn = "1";
		}
		if (passord.equals(rettPassord)) {
			rettPassord = "1";
		}
		if (rettBrukernavn.equals("1") && rettPassord.equals("1")) {
			showMessageDialog(null, "Velkommen inn!");
		}
		else {
			showMessageDialog(null, "Brukernavn eller passord er feil!");
		}
	}
	
	

}
