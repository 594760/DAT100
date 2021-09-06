package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;

public class OppgaveG1 {
	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Gi et tall: "));
		
		for (int i = 1; i < n; i++){
			System.out.println(i);
		}
	}
}
