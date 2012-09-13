package Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Oppgaver {

	private String[] premierLeague = { "Liverpool", "Manchester City",
			"Manchester United", "Chelsea", "Arsenal", "Tottenham", "Stoke",
			"Newcastle", "Swansea", "Sunderland", "Fulham" };

	public Oppgaver() {

	}// end of constructor

	/***
	 * Oppgave 1
	 * @param s
	 */
	public void oppgave1(String s) {
		s = " ";
		List<String> ll = new LinkedList(Arrays.asList(premierLeague));

		System.out.println("String[] --> list -- iterer gjennom vært element"+ "\n");
		Iterator<String> iterator = ll.iterator();
		Collections.sort(ll);
		while (iterator.hasNext()) {

			
			System.out.println((String) iterator.next());
		}

	}//end of oppgave1

	/***
	 * Oppgave 2
	 * @param s
	 */
	public void oppgave2(String s) {
		
		System.out.println();
		System.out.println();
		System.out.println("Oppgave 2: "+"\n");
		s = " ";
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(premierLeague));

		Iterator<String> iterator = al.iterator();
		
		Collections.sort(al);
		while (iterator.hasNext()) {
			
			System.out.println((String) iterator.next());
		}

	}//end of oppgave2

	/***
	 * Oppgave 3
	 * @param s
	 */
	public void oppgave3(String s){
		
		 ArrayList<String> liste = new ArrayList(Arrays.asList(premierLeague)); 
		 MyComparator mcr = new MyComparator();
		 Iterator<String> iterator = liste.iterator();
		 
		 Collections.sort(liste, mcr);
		 
		 System.out.println();
		 System.out.println("Oppgave 3:");
		 System.out.println();
		 
		 while(iterator.hasNext()){
			 System.out.println((String) iterator.next());
		 }
		  
		
	}
}// end of class
