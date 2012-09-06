package PrimTallAlgorithm;

import java.util.ArrayList;

public class PrimTall {

	/**
	 * @param args
	 */
	// This method tests whether a given number is prime or not.
	public static boolean isPrime(int num) {
		boolean prime = true;
		int limit = (int) Math.sqrt(num);

		for (int i = 2; i <= limit; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;
	}

	public static void main(String[] args) {
		// This loop writes out all the prime numbers less than 1000.
		long tid1, tid2;
		
		ArrayList<Integer> liste = new ArrayList<Integer>();

		tid1 = System.nanoTime();
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i))
				System.out.println(i);
				liste.add(i);
				
		}
		tid2 = System.nanoTime();
		
		double totTid =(tid2 -tid1);
		System.out.println("Det tok: " + totTid);
		
		System.out.println(liste+"\n");

	}
}
