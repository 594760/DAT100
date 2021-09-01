package no.hvl.dat100;

import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB1 {
	
	public static void main(String[]args) {
		String radiusTxt = showInputDialog("Hva er radiusen på kulen: ");
		
		int radius = parseInt(radiusTxt);
		double volum = 4.0/3.0*PI*radius*radius*radius;
		
		showMessageDialog(null, "Volumet på kula er : " + volum );
		
	}

}