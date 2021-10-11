package no.hvl.dat100;

public class Konto {
	private int kontonr;
	private double saldo;

	public Konto(int kontonummer, double startSaldo) {
		kontonr = kontonummer;
		saldo = startSaldo;
	}

	public int getKontoNr() {
		return kontonr;
	}

	public double getSaldo() {
		return saldo;
	}

	public double sjekkeSaldo() {
		return saldo;
	}

	public void setSaldo(double beløp) {
		saldo += beløp;
	}

}
