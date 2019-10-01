package single.number;

import java.util.HashMap;

public class SingleNumber {

	/*
	 * Given a non-empty array of integers.
	 * Every element appears twice except for one.
	 *
	 * Input: "[2, 2, 4, 4, 5]"
	 * Output: 5
	 *
	 * Input: "[4, 1, 2, 1, 2]"
	 * Output: 4
	 *
	 * Hint: the "PRO" one is submitted from the pros in Leetcode.com
	 */

	public SingleNumber() {
		System.out.println(singleNumber(new int[] {2,2,4,4,5}));
		System.out.println(singleNumberPRO(new int[] {2,2,4,4,5}));
	}
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> pair = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			pair.put(nums[i], (pair.containsKey(nums[i]) ? pair.get(nums[i]) : 0) + 1);
		}
		for(int i = 0; i < nums.length; i++) {
			if(pair.get(nums[i]) % 2 != 0)
				return nums[i];
		}
		return 0;
	}
	public int singleNumberPRO(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
}
