package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB2 {
	
	public static void main(String[]args) {
		String prisTxt = showInputDialog("Pris:");
		String betaltTxt = showInputDialog("Betalt:");
		int pris = Integer.parseInt(prisTxt);
		int betalt = Integer.parseInt(betaltTxt);
		
		int tiKroner = (betalt - pris)/10;
		int enKroner = (betalt - pris)%10;
		
		if (tiKroner == 1){
			showMessageDialog(null, "Du skal ha tilbake " + tiKroner + " ti korne og " + enKroner + " en kroner.");
		}
		else {
			showMessageDialog(null, "Du skal ha tilbake " + tiKroner + " ti korner og " + enKroner + " en kroner.");
		}
	}
}