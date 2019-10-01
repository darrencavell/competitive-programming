package morse.code;

import java.util.HashMap;
import java.util.HashSet;

public class MorseCode {

	/*
	 * Given an array of String morse code.
	 * Determine the existing morse code produced has differences in between them or not.
	 * Return the number of differences between them.
	 *
	 * Input: words = ["gin", "zen", "gig", "msg"]
	 * Output: 2
	 * Explanation:
	 * 	The transformation of each word is:
	 *  "gin" -> "--...-."
	 *  "zen" -> "--...-."
	 *  "gig" -> "--...--."
	 *  "msg" -> "--...--."
	 */

	/*
	 * BIG PLUS!
	 * This cases has new use cases of HashSet and StringBuilder.
	 */

	public MorseCode() {
		System.out.println(uniqueMorseRepresentations(new String[] {"gin", "zen", "gig", "msg"}));
	}
	public int uniqueMorseRepresentations(String[] words) {
		String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashSet<String> usedMorse = new HashSet<>();
		for(String word: words) {
			StringBuilder morse = new StringBuilder();
			for(char letter: word.toCharArray()) {
				morse.append(morseCode[letter - 'a']);
			}
			usedMorse.add(morse.toString());
		}
		return usedMorse.size();
	}
}
