package Oblig4;

import java.io.File;
import java.io.FileReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//variabler
		String textFile = ("oppg1.txt");
		//object
		Oppgaver oppg1, oppg2;
		
		
		/**
		 * Oppgave 1
		 */
		System.out.println("Oppgave 1:\n");
		oppg1 = new Oppgaver();
		oppg1.Oppgave1("Oppgave 1");
		
		/**
		 * Oppgave 2
		 */
		System.out.println("Oppgave 2:\n");
		oppg2 = new Oppgaver();
		oppg2.Oppgave2("oppgave 2:");
		
		/**
		 * Oppgave 3
		 */

	}

}
