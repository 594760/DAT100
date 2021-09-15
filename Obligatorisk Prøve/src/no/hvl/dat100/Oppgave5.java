
package no.hvl.dat100;
import static java.lang.Math.*;

public class Oppgave5 {
	public static void main(String[] args) {
		//har importet
		//import static java.lang.Math.*;
		System.out.println(arealSirkel(1.5));
		
	}

	private static double arealSirkel(double r) {
		double areal = (r*r * PI);
		return areal;
	}
}
