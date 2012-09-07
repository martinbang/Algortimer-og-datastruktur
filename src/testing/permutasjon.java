package testing;

import java.util.Random;

/***
 * Permutasjon fra 1 til N
 * @author Martin Bang Tøllefsen
 * Student nr: 490427
 */
public class permutasjon {
	
	private int n;
	private int[] a;
	
	Random r = new Random();
	
	// konstruktør som tar in N som parameter og setter N som en ny forekomst av A[].
	//Av antall N blir arrayet generert med tilfeldige verdier.
	public permutasjon(int n){
		
		this.n = n;
		this.a = new int[n];
		
		for (int i = 0; i < a.length; i++)
			  a[i] = i + 1; 
	}
	
	// metode for å print arrayet. Ikke nødvendig å ta String s, men ser fint ut:)
	public void print(String s){
		
	  String res = "";
	  System.out.println(s);
	  
	  	for (int i = 0; i < a.length; i++)
			  res += a[i] + " ";
			  System.out.println(res);
	   }
	
	
	//metode med linær o(n)
	public int[] permute() {
		
		for (int i = 0; i < a.length; i++) {
			
			int n = a.length; 			//in n lik []a sin lengde
			int o = r.nextInt(n - i); 	//lager et tilfeldig nummer fra n - i
			o += i; 					// Legger "i" til nummeret og hopper fremover i arrayet
			o += 1; 					// Legger til  1 til vært nummer 
										

			if (o < n) {  				//utføres kun vis o mindre en n.
				int h = a[i];
				a[i] = a[o];
				a[o] = h;
			}
		}
		return a;
	}
	
	// Oppgave b her måkonstruktøren endres slik at vi kan gp fra -n til n. 
	// dette kunne også gjøres fra en metode.
	permutasjon(int n, boolean yes) throws Exception {
		if (n % 2 != 0)
			throw new Exception("Exeption!");

		this.a = new int[n];  
		this.n = n;
		int b = -(n / 2);
		
		for (int i = 0; i < a.length; i++) {
			if (b == 0)
				b += 1;
			a[i] = b;
			b += 1;
		}
	}
}
