package unique.number.occurences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueNumberOccurences {

	/*
	 * Given an array of integer.
	 * Determine if the data repetition is unique on each number.
	 * Occurrences of number 2 is 2 times, occurrences of number 3 is 3 times, and occurrences of number 4 is 1 time.
	 * Therefore, this should return true as the number of times is unique.
	 *
	 * Input: "[2, 2, 3, 3, 3, 4]"
	 * Output: true
	 *
	 * Input: "[2, 1]"
	 * Output: false
	 */

	/*
	 * BIG PLUS!
	 * This cases has new use cases of HashMap and HashSet with unique number of occurrences.
	 */

	public UniqueNumberOccurences() {
		System.out.println(uniqueOccurrences(new int[] {2, 2, 2, 3, 3, 4}));
	}
	public boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> occurrences = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			occurrences.put(arr[i], 1 + occurrences.getOrDefault(arr[i], 0));
		}
		// This Iterator thing is good!
		// Iterator<Integer> itr = occurrences.keySet().iterator();
		// while (itr.hasNext()) {
		// 	Integer key = itr.next(); Integer value = occurrences.get(key);
		// 	System.out.println("The key is :: " + key + ", and value is :: " + value );
		// }
		return occurrences.size() == new HashSet<>(occurrences.values()).size();
	}
}
