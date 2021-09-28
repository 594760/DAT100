package no.hvl.dat100;

public class OppgaveB1 {

	public static void main(String[] args) {
		boolean[][] aud = 
			{ 
			  { false, true, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};
		
		System.out.println(ledigePlasser(aud));
		prosentFullt(aud);
		forsteLedigePlass(aud);
		forsteLedigePlassFraFront(aud);
	}
	
	public static int ledigePlasser(boolean [][] aud) {
		int antallLedigePlasser = 0;
		for(boolean rad[]: aud) {
			for(boolean plass : rad) {
				if (plass == true) {
					antallLedigePlasser ++;
				}
			}
		}
		return antallLedigePlasser;
	}
	
	public static int plasser(boolean [][] aud) {
		int plasser = 0;
		for (boolean [] rad: aud) {
			plasser += rad.length;				
		}
		return plasser;
	}
	
	public static double prosentFullt(boolean[][] aud) {
		int ledigePlasser = ledigePlasser(aud);
		int totalPlasser = plasser(aud); 
		double fultProsetn = ((totalPlasser-ledigePlasser)*(100.0/totalPlasser));	
		System.out.println(fultProsetn);
		return fultProsetn;
	}
	
	public static String forsteLedigePlass(boolean[][] aud) {
		String plassering = "";
		for (int i = 0; i < aud.length; i++) {
			for(int j = 0; j < aud[i].length; j++) {
				if (aud[i][j] == false) {
					plassering = "Rad: " + i + " Plass: " + j;
					break;
				}
			}
		 if (plassering != "") {
			 break;
		 }
		}
		System.out.println(plassering);
		return plassering;
	}
	
	public static String forsteLedigePlassFraFront(boolean[][] aud) {
		String plassering = "";
		for (int i = aud.length-1; i > 0; i--) {
			for(int j = aud[i].length-1; j > 0; j--) {
				if (aud[i][j] == false) {
					plassering = "Rad: " + i + " Plass: " + j;
					break;
				}
			}
			if (plassering != "") {
				break;
			}
		}
		System.out.println(plassering);
		return plassering;
	}
}	