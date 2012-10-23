package Oblig3;


import java.util.Iterator;
/***
 * 
 * @author Martin - Oblig 3 Kap 19
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		BinaryTree<String> tree = new BinaryTree<String>();
		//tree.insert("John");
		// sett inn mer
		String[] names = {"John", "Arne", "Kari"};
		//legger hver String inn i BinaryTree
		for(int i = 0; i < names.length; i++){
			tree.insert(names[i]);
		}
		// test iteratoren
		//oppgave 1
		System.out.println("Oppgave 1");
		Iterator it = tree.inorderIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println();
		//Oppgave 2
		//Skriv en preorder iterator for treet. Skriv kode som tester.
		System.out.println("Oppgave 2");
		Iterator it1 = tree.preorderIterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		//oppgave 2B
		//Skriv en postorder iterator for treet. Skriv kode som tester.
		System.out.println();
		Iterator it2 = tree.postorderIterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		
		
	}//end of main

}//end of class
