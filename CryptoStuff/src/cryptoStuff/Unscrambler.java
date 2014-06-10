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
		HashMap<Character, Integer> letterFrequency = new HashMap<Character, Integer>();
		 
		for(char c: letters)
		{
		   if(letterFrequency.containsKey(c))
		   {
			   letterFrequency.put(c, letterFrequency.get(c)+1);
		   }
		   
		   else
			   letterFrequency.put(c, 1);
		}
		
		System.out.println(letterFrequency);
	}
	
	
	public void tryLetters(char encodedletter, char replaceWith)
	{
		for(int i=0; i<letters.length-1; i++)
		{
			if(letters[i] == encodedletter)
			{
				letters[i] = replaceWith;
			}
		}
		
		
	}
	
	public void printSoFar()
	{
		for(char c: letters)
			System.out.print(c);
	}
	
	
	

}
