package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB4 {
	
	public static void main(String[]args) {
		String bruttolønnTxt = showInputDialog("Bruttolønn: ");
		int bruttolønn= Integer.parseInt(bruttolønnTxt);
		float trinnSkatten = 0.0f;
		
		if (bruttolønn > 164100 && bruttolønn <= 230950) {
			trinnSkatten = bruttolønn*0.0093f;
		}
		else if (bruttolønn > 230950 && bruttolønn <= 580650) {
			trinnSkatten = bruttolønn*0.0241f;
		}
		else if (bruttolønn > 580650 && bruttolønn <= 934050) {
			trinnSkatten = bruttolønn*0.1152f;
		}
		else if (bruttolønn > 934050) {
			trinnSkatten = bruttolønn*0.1452f;
		}
		showMessageDialog(null, "Trinnskatten på en bruttolønn på " + bruttolønn + " er " + trinnSkatten);
	}

}
