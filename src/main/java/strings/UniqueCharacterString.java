package strings;

import java.util.Scanner;

public class UniqueCharacterString {

	public static boolean hasUniqueCharacters(String inputString) {
		int checker = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char currentCharacter = inputString.charAt(i);
			int asciiOffset = currentCharacter - 'a';
			int offset = (1 << asciiOffset);
			if ((checker & offset) > 0) { return false; }
			checker |= (1 << asciiOffset);
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the string to be tested : ");
		Scanner in = new Scanner(System.in);
		String inputString = in.next();
		boolean hasUniqueCharacters = hasUniqueCharacters(inputString);
		System.out.println("String " + inputString 
				+ ( hasUniqueCharacters ? " has" : " does not have " ) + " unique characters");
	}
	
}
