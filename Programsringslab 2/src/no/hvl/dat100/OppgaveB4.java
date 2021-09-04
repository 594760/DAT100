package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4 {
	
	public static void main(String[]args) {
		String bruttol�nnTxt = showInputDialog("Bruttol�nn: ");
		int bruttol�nn= Integer.parseInt(bruttol�nnTxt);
		float trinnSkatten = 0.0f;
		
		if (bruttol�nn > 164100 && bruttol�nn <= 230950) {
			trinnSkatten = bruttol�nn*0.0093f;
		}
		else if (bruttol�nn > 230950 && bruttol�nn <= 580650) {
			trinnSkatten = bruttol�nn*0.0241f;
		}
		else if (bruttol�nn > 580650 && bruttol�nn <= 934050) {
			trinnSkatten = bruttol�nn*0.1152f;
		}
		else if (bruttol�nn > 934050) {
			trinnSkatten = bruttol�nn*0.1452f;
		}
		showMessageDialog(null, "Trinnskatten p� en bruttol�nn p� " + bruttol�nn + " er " + trinnSkatten);
	}

}
