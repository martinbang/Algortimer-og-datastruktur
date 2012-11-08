package Oblig4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Oppgaver {
	
	String textFile = "oppg1.txt";
	
	//Constructor
	public Oppgaver(){
		
	}
	
	/**
	 * Metode for oppgave 1.
	 * Leser inn svar fra oppgave 1 flervalgs spørsmål
	 * @param s
	 * @throws IOException 
	 */
	public void Oppgave1(String s) throws IOException{
		File f = new File("oppg1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		StringBuffer sb = new StringBuffer();
		String eachLine = br.readLine();
		
		while(eachLine != null){
			sb.append(eachLine);
			sb.append("\n");
			eachLine = br.readLine();
		}//end of while
		System.out.println(sb.toString());
	}
}
