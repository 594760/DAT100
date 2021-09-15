package no.hvl.dat100;

public class Oppgave4 {
	public static void main(String[] args) {
		double m = minst(2.3, 1.4, 3.5);
		System.out.println(m);
	}
	public static double minst(double x, double y, double z) {
		double m = x;
		if (y < m) {
			m = y;
		}
		if (z < m) {
			m = z;
		}
		return m;
	}
}
