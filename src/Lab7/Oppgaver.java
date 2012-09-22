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
		System.out.println("Skrivv inn eks 123456:");
		int n = scan.nextInt();

		skrivUT(n);
		System.out.println();
	}

	/**
	 * Oppgave3  beregner n! (n fakultet)
	 */
	public void Oppgave3() 
	{	
		System.out.println();
		System.out.println("Skriv inn N tall du vil beregne fakultet til: ");
		int n = scan.nextInt();
		
		System.out.println(fakultet(n));
	}
	
	//Til oppgave 1
	public long sum(int n) {

		if (n == 1)
			return 1;
		else
			return sum(n - 1) + n;

	}
	//Til oppgave 2
	public void skrivUT(int n) {

		if( n >= 10)
			skrivUT( n / 10);
			   System.out.print(n % 10 + " - ");
		}
	//Til oppgave 3
	
	public int fakultet(int n)
	{
		if(n == 1)
			return 1;
		else
			return n * fakultet(n-1);
	}

	

}// End of class
