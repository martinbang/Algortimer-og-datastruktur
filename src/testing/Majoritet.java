package testing;

import java.util.Random;

public class Majoritet {

	/**
	 * @param args
	 */
	
	 public static int major1(int [] a, int span)
	   {
	       long tid1, tid2;
	       
	       tid1 = System.nanoTime();

	       // Selve løsningen
	       for(int i = 0; i < a.length; i++){
	    	   
	    	  
	       }
	       

	       tid2 = System.nanoTime();
	       double tidIsek = tid2 - tid1;
	       System.out.println("Det tok " + tidIsek);
	       
	       return 0;
	   }
	 
	
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// driverprogrammet (main) er ikke en del av algoritmen eller analysen..
		Random generator = new Random();
		final int ARR2SIZE = 100;
		final int MAXTALL = 10;
		int[] arr1 = { 3, 3, 4, 2, 4, 4, 2, 4, 4 }; // et array
		int[] arr2 = new int[ARR2SIZE]; // hvorfor ikke et til?
		arr2[0] = 1;
		
		for (int i = 1; i < arr2.length - 1; i += 2) {
			arr2[i] = (generator.nextInt(MAXTALL) + 1);
			arr2[i + 1] = 5;
		}

		System.out.println("Majoritetselement: " + major1(arr1, 4));
		System.out.println("Majoritetselement: " + major1(arr2, MAXTALL));
	}

}
