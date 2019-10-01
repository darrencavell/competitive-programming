package jewels.and.stones;

import java.util.HashMap;

public class JewelsAndStones {

	/*
	 * Given a string J consists of jewels.
	 * Given a string S consists of stones.
	 * Return how many jewels you have apart from that stone.
	 *
	 * Input: J = "aA", S = "aAABBBBB"
	 * Output: 3
	 *
	 * Input: J = "z", S = "ZZ"
	 * Output: 0
	 */

	public JewelsAndStones() {
		System.out.println(numJewelsInStones("z", "ZZ"));
	}
	public int numJewelsInStones(String J, String S) {
		HashMap<Character, Integer> gems = new HashMap<>();
		for(int i = 0; i < J.length(); i++) {
			gems.put(J.charAt(i), 1);
		}
		int result = 0;
		for(int i = 0; i < S.length(); i++) {
			if(gems.containsKey(S.charAt((i))))
				result++;
		}
		return result;
	}
}
