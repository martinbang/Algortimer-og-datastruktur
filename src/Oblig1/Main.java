package Oblig1;

import java.util.HashMap;
import java.util.Random;

/***
 * 
 * @author Ken-Håvard og Martin Bang Tøllefsen
 *
 */


public class Main {
	
	public static void main(String[] args)
	{
		
		Pair<String,Integer> p = new Pair<String, Integer>("hello", 2);
		System.out.println(p.getFirst());
		System.out.println(p.getSecound());
		
		
		Oppgave2();
		Oppgave3();
		
	}
	
	
	
	/***
	 * Oppgave2 ,3 
	 */
	private static void Oppgave2()
	{
		Integer[] a = fill(10);		
		
		System.out.print("Før: ");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
		
		permute(a);
		
		System.out.print("\nEtter: ");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
		
		a = fill(-5, 10);		
		
		System.out.print("\nFør: ");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
		
		permute(a);
		
		System.out.print("\nEtter: ");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void Oppgave3()
	{
	    Random generator = new Random();
	    final int ARR2SIZE = 100;
	    final int MAXTALL = 10;
	    int [] arr1 = {3, 3, 4, 4, 2, 4, 2, 4, 4}; // et array
	    int [] arr2 = new int [ARR2SIZE];	// hvorfor ikke et til?
	    arr2[0] = 1;
	    for(int i = 1; i<arr2.length-1;i+=2)
	    {
	       arr2[i] = (generator.nextInt(MAXTALL) + 1);
	       arr2[i+1] = 5;
	    }
	   
	    System.out.println("Majoritetselement: " + major1(arr1, 4));
	    System.out.println("Majoritetselement: " + major1(arr2, MAXTALL));
	}
	
	//
	// Oppgave 2
	//
	public static Integer[] fill(int n)
	{
		Integer[] a = new Integer[n];
		for (int i = 1; i <= n; i++)
		{
			a[i - 1] = i;
		}
		return a;
	}
	
	public static Integer[] fill(int start, int n)
	{
		Integer[] a = new Integer[n];
		int c = 0;
		for (int i = start; c < n; i++)
		{			
			a[c] = i;
			c++; // :P
		}
		return a;
	}
	
	public static void permute(Integer[] p)
	{
		Random r = new Random();		
		for (int i = 0; i < p.length; i++)
		{
			int x = r.nextInt(p.length);
			int y = p[i];
			p[i] = p[x];
			p[x] = y;		
		}
	}
	
	//
	// Oppgave 3
	//
	public static int major1(int [] a, int span)
	   {
	       long tid1, tid2;
	       
	       tid1 = System.nanoTime();

	       // Selve løsningen
	       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	       for (int i = 0; i < a.length; i++)
	       {
	    	   if (map.containsKey(a[i]))
	    	   {
	    		   map.put(a[i], (int)map.get(a[i]) + 1);
	    	   }
	    	   else
	    	   {
	    		   map.put(a[i], 1);
	    	   }
	       }
	       
	       boolean found = false;
	       int major = 0;
	       for (int i : map.keySet())
	       {
	    	   if (map.get(i) > a.length / 2)
	    	   {
	    		   found = true;
	    		   major = i;
	    	   }
	       }

	       tid2 = System.nanoTime();
	       double tidIsek = (tid2 - tid1) * 0.000001;
	       System.out.printf("Det tok %.4fms\n", tidIsek);
	       
	       if (!found)
	       {
	    	   System.out.println("Fant ikke noe majoritetselement!");
	       }
	       
	       return major;
	   }
}

