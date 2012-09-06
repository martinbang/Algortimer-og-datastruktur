package Oblig1;

import java.util.Random;

/***
 * Algoritmer og Datastruktur.
 * @author Martin
 *
 */

public class Oppgave2 {
	
	public static void main(String[]args) throws Exception{
		
		
		
		/***
		 * Oppgave 1 Generics
		 */
		Pair<String,Integer> p1;
		Pair<String,String> p2;
		
		p1 = new Pair<String, Integer>("one", 2);
		p2 = new Pair<String, String>("one", "Two");
		
		System.out.println(p1.getFirst()+ "," + p1.getSecound());
		System.out.println(p2.getFirst()+ "," + p2.getSecound());
		System.out.println("-------------------------------------------");
		
		
		/***
		 * Oppgave 2 kap 5 Analyse av algoritme
		 */
		
		permutasjon pm1 ,pm2; 
		
		//oppgave 2a
		pm1 = new permutasjon(10);  // her settes N = 10;
		pm1.print("Før permutasjonen, 1 til n");
		pm1.permute();
		pm1.print("Etter permutasjonen, 1 til n");
		
		//oppgave 2b
		pm2 = new permutasjon(10, true); //her settes N = 10. tar også med en boolean verdi .
		pm2.print("Før permutation -n til n");
		int[] out = pm2.permute();
		pm2.print("Etter permutasjonen -n til n");
		
	}
	
	

}
