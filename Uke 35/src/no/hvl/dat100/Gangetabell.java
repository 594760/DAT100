package no.hvl.dat100;


public class Gangetabell {

	public static void main(String[] args) {
		final int N = 4;
		
		System.out.print("*");
		for (int i = 1; i <= N; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		
		for (int i = 1; i <= N; i++) {
			System.out.print(i);
			for (int j = 1; j <= N; j++) {
				System.out.print(" " + (i*j) + " ");
			}
			System.out.println();
		}
	}

}
