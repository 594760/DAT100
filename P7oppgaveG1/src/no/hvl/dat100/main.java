package no.hvl.dat100;

public class main {
	public static void main(String[] args) {
		Kvadrat kv3 = new Kvadrat(3);
		Kvadrat kv4 = new Kvadrat(4);
		Kvadrat kv5 = new Kvadrat(5);
		
		kv3.skrivUt();
		kv4.skrivUt();
		kv5.skrivUt();
		
		Kvadrat [] tabell = {kv3, kv4, kv5};
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.println("Arealet til kv" + (i+3) + ": " + tabell[i].arealet());
		}
				
		System.out.println();
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.println("Omkretsen til kv" + (i+3) + ": " + tabell[i].omkretsen());		
		}
		
		System.out.println();
		
		for(int i = 0; i < tabell.length; i++) {
			System.out.println("Diagonalen til kv" + (i+3) + ": " + tabell[i].diagonal());
		}
		
		System.out.println();
		System.out.println(kv5.sum(kv3, kv4));
		
		Kvadrat kv0 = new Kvadrat(0);
		Kvadrat kv6 = new Kvadrat(6);
		
		System.out.println();
		System.out.println(kv6.sum(kv3, kv5));
		
		System.out.println();
		System.out.println(kv6.sum(kv6, kv0));
		
	}
}
