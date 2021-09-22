package no.hvl.dat100;

import easygraphics.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class OppgaveB5 extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
}
	public void run() {
		
		int antallRinger = parseInt(showInputDialog("Hvor mange ringer skal du ha?")); 
		int radius = 20;
		int x = 400;
		int y = 400;
		
		makeWindow("Grafikk" ,800, 800);
		tegneRinger(antallRinger, x, y, radius);

	}
	
	public void tegneRinger(int antallRinger, int x, int y, int radius) {
		radius = radius*antallRinger;
		for(int i = 0; i < antallRinger; i++) {
			if(i%2 == 0) {
				setColor(0, 0, 0);
				fillCircle(x, y, radius);
			}
			else {
				setColor(255, 255, 255);
				fillCircle(x, y, radius);	
			}
			radius = radius - 20;
		}
	}
}
