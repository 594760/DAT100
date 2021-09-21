package no.hvl.dat100;

import static java.lang.Math.*;


public class OppgaveB1 {
	public static void main(String[] args) {
		int [] xGrader = lageXTabell();
		double [] xRadianer = lageXRadianerTabell(xGrader);
		double [] sinX = lageSinXTabell(xRadianer);
		double [] cosX = lageCosXTabell(xRadianer);
		
		for (int i = 0; i< xGrader.length; i++) {
			if (i == 0) {
				System.out.println("  x i grader  x i radianer    sin(x)    cos(x)");
				System.out.println("------------------------------------------------");
			}
		
			if (xGrader[i] < 10)
				System.out.print("           " + xGrader[i]);
			else if (xGrader[i] < 100)
				System.out.print("          " + xGrader[i]);
			else
				System.out.print("         " + xGrader[i]);
			
			System.out.print("       " + String.format("%.3f", xRadianer[i]));
			System.out.print("      " + String.format("%.3f", sinX[i]));
			
			if (cosX[i] > 0)
				System.out.println("      " + String.format("%.3f", cosX[i]));
			else
				System.out.println("     " + String.format("%.3f", cosX[i]));
		
			if (i == (xGrader.length - 1))
				System.out.println("------------------------------------------------");
		}
	}
	
	public static int [] lageXTabell() {
		int[] xGrader = new int[180/15+1];
		for (int i = 0; i < xGrader.length; i++) {
			xGrader[i] = 15*i;
		}
		return xGrader;
	}
	
	public static double [] lageSinXTabell(double [] xRadianer) {
		double [] sinXTabell = new double[xRadianer.length];
		for (int i = 0; i < xRadianer.length; i++) {
			sinXTabell[i] = sin(xRadianer[i]);
		}
		return sinXTabell;
	}
	
	public static double [] lageCosXTabell(double [] xRadianer) {
		double [] cosXTabell = new double[xRadianer.length];
		for (int i = 0; i < xRadianer.length; i++) {
			cosXTabell[i] = cos(xRadianer[i]);
		}
		return cosXTabell;
	}
	
	public static double [] lageXRadianerTabell(int [] xGrader) {
		double [] xRadianerTabell = new double[xGrader.length];
		for (int i = 0; i < xGrader.length; i++) {
			xRadianerTabell[i] = (PI * xGrader[i])/180;
		}
		return xRadianerTabell;
	}
}
