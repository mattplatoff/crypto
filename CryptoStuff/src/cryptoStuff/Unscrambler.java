package cryptoStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unscrambler {
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
	
	}
public void freq(String text){
	int [] freq=new int[26];
	
	
	
	
	
	
}



}
