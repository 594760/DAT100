package no.hvl.dat100;

import easygraphics.*;

public class OppgaveB3 extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		makeWindow("Grafikk", 1200, 600);
		int x = 50;
		int y = 20;
		int bredde = 90;
		int hoyde = 60;
		
		rekkeHalvP�Slutten(x, y, bredde, hoyde);
		y = y + hoyde;
		rekkeHalvP�Starten(x, y, bredde, hoyde);
		y = y + hoyde;
		rekkeHalvP�Slutten(x, y, bredde, hoyde);
		y = y + hoyde;
		rekkeHalvP�Starten(x, y, bredde, hoyde);
		}
	
	public void rekkeHalvP�Slutten(int x, int y, int bredde, int hoyde) {
		for (int i = 0; i < 11; i++) {
			if (i != 10) {
				drawRectangle(x, y, bredde, hoyde);
				x = x + bredde;
			}
			else {
				drawRectangle(x, y, bredde/2, hoyde);
			}
		}
	}
	public void rekkeHalvP�Starten(int x, int y, int bredde, int hoyde) {
		for (int i = 0; i < 11; i++) {
			if (i == 0) {
				drawRectangle(x, y, bredde/2, hoyde);
				x = x + (bredde/2);
			}
			else {
				drawRectangle(x, y, bredde, hoyde);
				x = x + bredde;
			}
		}
	}
}
	