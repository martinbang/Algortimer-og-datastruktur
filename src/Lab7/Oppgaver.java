package Lab7;

import java.util.Scanner;

public class Oppgaver {

	Scanner scan = new Scanner(System.in);

	public Oppgaver() {

	}

	/**
	 * Oppgave 1, rekursiv metode som summerer tallene fra 1 til n, gitt n.
	 * Fungerer ikke
	 */
	public void Oppgave1() {
		System.out.println("Skriv inn tall for n");
		int n = scan.nextInt();

		System.out.println(sum(n));

	}

	/**
	 * Oppgave2, fungere printer ut med " - ";
	 */

	public void Oppgave2() {
		System.out.println("Skrivv inn eks 10:");
		int n = scan.nextInt();

		skrivUT(n);
	}

	/**
	 * Oppgave3
	 */
	public void Oppgave3() 
	{

	}
	
	//Til oppgave 1
	public long sum(int n) {

		if (n == 1)
			return 1;
		else
			return sum(n - 1) + 1;

	}
	//Til oppgave 2
	public void skrivUT(int n) {
		if( n >= 10)
			skrivUT( n / 10);
			   System.out.print(n % 10 + " - ");
		}
		

	

}// End of class
