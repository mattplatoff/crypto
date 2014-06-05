package cryptoStuff;

import java.util.HashMap;
import java.util.HashSet;

public class FrequencyData {

	double frequency;
	String encodedLetter;
	String decodedLetter;
	  HashMap<Character, Integer> letterFrequency = new HashMap<Character, Integer>();
	  public static HashSet<Integer> nums = new HashSet <Integer> ();
	  public static void main(String[] args) {
		
		 nums.add(7508779);
		 nums.add(5310862);
		 nums.add(7508779);
		 System.out.println(nums);
	  } 
	  
}
