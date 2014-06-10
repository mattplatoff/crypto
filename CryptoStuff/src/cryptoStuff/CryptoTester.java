package cryptoStuff;

import java.io.IOException;
import java.util.Scanner;

public class CryptoTester {

	public static void main(String[] args) throws IOException {
//		System.out.println(new File("").getCanonicalPath());
		Unscrambler test1 = new Unscrambler("CryptoTest.txt");
		test1.frequency();
		
		int action = 0;
		Scanner user = new Scanner(System.in);
		while (action != 9) 
		{
			System.out.println("Please select option? Options: /n 1- Print Frequency /n 2- Switch Letter /n 3- Print current progress");
			action = user.nextInt();
			
			switch (action) 
			{
			case 1:
				test1.frequency();
				break;
				
			case 2:
				System.out.println("What letter would you like to replace");
				char letter = user.nextLine().charAt(0);
				System.out.println("What would you like to replace it with?");
				char replacement = user.nextLine().charAt(0);
				test1.tryLetters(letter, replacement);
				
				break;
			case 3:
				test1.printSoFar();
				break;
				
			case 9:
				System.out.println("Stopping!");
				break;
			
			}
		}
	}

}
