package no.hvl.dat100;

import easygraphics.EasyGraphics;

public class OppgaveB2 extends EasyGraphics{

	int[][] terreng = { { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 }, { 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 },
			{ 0, 0, 0, 3, 3, 3, 6, 7, 8, 10 } };
	
	public static void main(String[] args) {
			launch(args);
	}
	
	public void run() {
		makeWindow("Flodding", 800,300);
		
		visulaiser();
	}
	
	public void visulaiser() {
		int x = 50;
		int y = 50;
		int radius = 30;
		
		System.out.println("Angi havhøyde i tegnevinduet ...");
		int hav = Integer.parseInt(getText("Havhøyde: "));
		
		while (hav >= 0) {
			for (int i  = 0; i < terreng.length; i++) {
				for (int j = 0; j < terreng[i].length; j++) {
					if(hav >= terreng[i][j]) {
						setColor(0, 0, 255);
					}
					else if (hav+1 == terreng[i][j]) {
						setColor(255, 140, 0);
					}
					else {
						setColor(222, 184, 135);
					}
					
					fillCircle(x, y, radius);
					x = x+(2*radius);
				}
				x = 50;
				y = y+(2*radius);
			}
			y = 50;
			System.out.println("Angi havhøyde i tegnevinduet ...");
			hav = Integer.parseInt(getText("Havhøyde: "));
		}
	}
}
