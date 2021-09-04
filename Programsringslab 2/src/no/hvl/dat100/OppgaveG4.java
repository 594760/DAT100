<<<<<<< HEAD
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
=======
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
>>>>>>> branch 'master' of git@github.com:594760/DAT100.git
