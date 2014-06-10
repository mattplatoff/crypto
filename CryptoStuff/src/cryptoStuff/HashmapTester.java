package cryptoStuff;

import java.util.HashMap;

public class HashmapTester {

	public static void main(String[] args) {
		String test = "Hello what is your name. Is it Mohamed? Or is it Matt, because I really want to know.";
		char [] letters = new char[test.length()];
		letters = test.toCharArray();
		
		
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
		
		for(char c: letters)
			System.out.print(c);
	}
	
	
	

}
