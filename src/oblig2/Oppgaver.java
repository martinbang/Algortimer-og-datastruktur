package oblig2;

import java.util.Scanner;

/***
 * Oblig 2, Algoritmer og Datastruktur
 * 
 * @author 490427
 * 
 */
public class Oppgaver {

	Scanner scan = new Scanner(System.in);

	// Constructor
	public Oppgaver() {

	}

	/**
	 * Oppgave 1 Palindromes test
	 */
	public void Oppgave1() {

		System.out.println("Oppgave 1: ");
		System.out.println("type a word to check if its a palindrome or not");
		String x = scan.nextLine();
		if (isPal(x))
			System.out.println(x + " is a palindrome");
		else
			System.out.println(x + " is not a palindrome");

	}

	/**
	 * Oppgave 2 Greatest Common Divisor, GCD) for to tall
	 */
	public void Oppgave2() {
		System.out.println();
		System.out.println("oppgave 2");
		System.out.print("Enter first intger");
		int n1 = scan.nextInt();
		System.out.println("Enter secound integer:");
		int n2 = scan.nextInt();

		// System.out.println(gdc(n1, n2));

		System.out.println("The greatest common divisor for " + n1 + " and "
				+ n2 + " is " + gdc(n1, n2));

	}

	/**
	 * Oppgave3
	 */
	public void Oppgave3() {

	}

	public boolean isPal(String s) {

		if (s.length() == 0 || s.length() == 1) {
			return true;
		}

		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			System.out.println(s.substring(1, s.length() - 1));
			return isPal(s.substring(1, s.length() - 1));
		}

		return false;

	}

	// Oppgave 2, Method GDC
	public int gdc(int m, int n) {

		if (m % n == 0)
			return n;
		else
			return gdc(n, m % n);

		// metode 2 som det også kan gjøres på.
		// men bruk ikke mer kode en nødvendig!
		/*
		 * if (n == 0) return m; else if (n > m) return gdc(n, m); else return
		 * gdc(n, m % n);
		 */
	}
}
