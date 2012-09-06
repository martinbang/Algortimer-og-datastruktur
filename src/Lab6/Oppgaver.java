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

	// oppgave 1
	public void oppgave1(String s) {
		s = " ";
		List ll = new LinkedList(Arrays.asList(premierLeague));

		System.out.println("String[] --> list -- iterer gjennom vært element"+ "\n");
		Iterator iterator = ll.iterator();
		while (iterator.hasNext()) {

			Collections.sort(ll);
			System.out.println((String) iterator.next());
		}

	}//end of oppgave1

	// oppgave 2
	public void oppgave2(String s) {
		
		System.out.println();
		System.out.println();
		s = " ";
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(premierLeague));

		Iterator iterator = al.iterator();

		while (iterator.hasNext()) {
			Collections.sort(al);
			System.out.println((String) iterator.next());
		}

	}//end of oppgave2

}// end of class
