package no.hvl.dat100;

/**
 * lager et kvadrat X*X.
 * 
 * @author Stein Olav
 *   
 */
public class Kvadrat {
	int sidelengde;
	
	public Kvadrat(int sidelendgde) {
		this.sidelengde = sidelendgde;
	}
	
	public void skrivUt() {
		for (int i=0; i < sidelengde; i++) {
		      for (int j=0; j < sidelengde; j++) {		    	  
		    	  System.out.print("* ");
		      }
		      System.out.println();
		}      
		System.out.println();      
	}
	
	public int arealet() {
		int sum = sidelengde*sidelengde;
		return sum;
		
	}
	
	public int omkretsen() {
		int sum = sidelengde * 4;
		return sum;
	}
	
	public int diagonal() {
		return sidelengde;
	}
	
	public boolean sum(Kvadrat a, Kvadrat b) {
		if (a.arealet()+b.arealet() == sidelengde*sidelengde) {
			return true;			
		}
		return false;
		}
	
}
