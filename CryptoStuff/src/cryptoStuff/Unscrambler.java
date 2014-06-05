package cryptoStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unscrambler {
// done
String text;
	public Unscrambler(String path) throws FileNotFoundException{
		Scanner scan=new Scanner(new File(path));
		while (scan.hasNext())
		text+=scan.nextLine();
	}

	public void print(){
	String printer = null;
	Scanner scan=new Scanner(text);
	for (int n=0;n<text.length();n++){
		printer+=scan.next();
		if (n%10==0){
			printer+="/n";
		}
	}
	System.out.println(printer);
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
public void freq(String text){
	int [] freq=new int[26];
	
	
	
	
	
	
}


	

}
