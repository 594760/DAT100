package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Mssndesnr {
	public static void main(String[] args) {	
		
		int mnd = 0;
		boolean uloveligmnd = false;
		
		do {
			mnd = Integer.parseInt(showInputDialog("Mndnr : "));
			uloveligmnd = mnd < 1 || mnd > 12;
			if (uloveligmnd) {
				showMessageDialog(null, "Ulovlig nr. må være 1 ... 12");
				}
			} while (uloveligmnd);
		
		System.out.println("Måndesnr: " + mnd);
		
		}
}
