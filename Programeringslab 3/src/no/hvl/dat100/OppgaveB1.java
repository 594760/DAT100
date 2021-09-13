package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

import sun.tools.jconsole.MaximizableInternalFrame;

public class OppgaveB1 {
	public static void main(String[] args) {
		int lowerLimit = minNumber();
		int upperLimit = maxNumber();
		
		String result = oddNumbers(lowerLimit, upperLimit);
		
		showMessageDialog(null, "Oddetalene er: " + result);
	}
	
	private static int minNumber() {
		int tall = parseInt(showInputDialog("Sett nedere grense: "));
		return tall;
	}
	
	private static int maxNumber() {
		int tall = parseInt(showInputDialog("Sett øvre grense: "));
		return tall;
	}
	
	private static String oddNumbers(int startNumber, int endNumber) {
		String numbersOdd= "";
		for (int i = startNumber; i <= endNumber;) {
			if (i % 2 == 1) {
				numbersOdd = numbersOdd + ", " + String.valueOf(i); 
			}
			i++;
		}
		return numbersOdd;
	}
}
