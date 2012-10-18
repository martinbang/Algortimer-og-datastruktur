package oblig2;

import java.util.Comparator;

public class CircleSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		//Sort.quicksort(list);
		printOutList(list);

		Circle[] list1 = { new Circle("Red", 3), 
						   new Circle("Green", 8),
						   new Circle("Blue", 12), 
						   new Circle("Yellow", 10),
						   new Circle("Blue", 11), 
						   new Circle("Yellow", 11) 
						};

		//quicksort(list1, new CircleSorter_Color());
		printOutList(list1);

		// quicksort(list1, new CircleAreaComparator());
		// printList(list1);
	}
	
	
	
	/**
	 * Print the contents of a list
	 */
	public static <E> void printOutList(E[] list) {
		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		System.out.println();
	}

}
