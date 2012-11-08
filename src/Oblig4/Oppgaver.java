package Oblig4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Oppgaver {
	
	//textFiles
	String oppg1Text= "oppg1.txt";
	String oppg2Text = "oppg2.txt";
	
	ReadFromFile r1, r2;
	
	//Constructor
	public Oppgaver(){
		
	}
	
	/**
	 * Metode for oppgave 1.
	 * Leser inn svar fra oppgave 1 flervalgs spørsmål
	 * @link ReadFromFile.java
	 * @param s
	 * @throws IOException 
	 */
	public void Oppgave1(String s) throws IOException{
		r1 = new ReadFromFile();
		r1.ReadFile(oppg1Text);
	
	}//end of Oppgave1
	
	/**
	 * Metode for oppgave 2
	 * Leser inn svar fra oppgave 2 flervalgs
	 * @link ReadFromFile.java
	 * @param s
	 * @throws IOException
	 */
	public void Oppgave2(String s) throws IOException{
		
		r2 = new ReadFromFile();
		r2.ReadFile(oppg2Text);
	}//end of oppgave2
	
	
	/**
	 * Oppgave 3. 
	 * @link TreeNode.java && Tree.java 
	 */
	public void Oppgave3(){
		
	}//end of oppgave3
	
}//end of class
