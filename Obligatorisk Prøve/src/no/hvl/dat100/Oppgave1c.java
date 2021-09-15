package no.hvl.dat100;

public class Oppgave1c {
	public static void main(String[] args) {
		int tall = 5;
		
		switch (tall) {
			case 0 -> {
				System.out.println("null");
			}
			case 1 -> {
				System.out.println("en");
			}
			case 2 ->  {
				System.out.println("to");
			}
			case 3 -> {
				System.out.println("tre");
			}
			case 4 -> {
				System.out.println("fire");
			}
			default ->
				System.out.println("ulovlig verdi");
			}
	}

}
