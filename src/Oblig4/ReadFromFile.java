package Oblig4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/***
 * Klasse som brukes for å lese fra fill.
 * @author 490427 - Martin Bang Tøllefsen
 *
 */
public class ReadFromFile {
	
	//Constructor
	public ReadFromFile(){
		
	}
	
	/**
	 * 
	 * @param textFile - Representer text filen du vil bruke
	 * @throws IOException
	 */
	public void ReadFile(String textFile) throws IOException{
		
		File f = new File(textFile);
		
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
	}//end of ReadFile

}//end of class
