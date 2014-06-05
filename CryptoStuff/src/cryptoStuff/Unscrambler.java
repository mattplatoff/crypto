package cryptoStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Unscrambler {

	String text;
	char [] letters;
	public Unscrambler(String filePath) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("filePath"));
		int n = 0;
		while(scan.hasNext())
		{
			text+= scan.next();
			if(n%50 == 0)
				text+= "/n" + scan.next();
			
			n++;
		}
		
		letters = new char[text.length()];
		letters = text.toCharArray();
	}
	
	public void frequency()
	{
		for(int i=0; i< letters.length-1; i++)
		{
			
		}
		HashMap<Character, Integer> letterFrequency = new HashMap<Character, Integer>();
		 
	}
	

}
