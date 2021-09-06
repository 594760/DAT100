package no.hvl.dat100;

// Outputen jeg forventer er:
// Test av repitasjonssetning.
// ***************************
// Dette er linje nr. 1
// Dette er linje nr. 2
// Dette er linje nr. 3
// Dette er linje nr. 4
//
//Dette er linje nr. 5
//Dette er linje nr. 6
//Dette er linje nr. 7
//Dette er linje nr. 8
//
//Dette er linje nr. 9
//Dette er linje nr. 10

public class OppgaveG4 {

		  public static void main(String[] args) {

		    int i;

		    System.out.println("Test av repetisjonssetning.");
		    System.out.println("***************************");

		    i = 1;

		    while (i <= 10) {
		      System.out.println("Dette er linje nr. " + i);

		      if (i == 4) {
		        System.out.println();
		      }

		      if (i == 8) {
		        System.out.println();
		      }

		      i = i + 1;
		    }
		  }
}
