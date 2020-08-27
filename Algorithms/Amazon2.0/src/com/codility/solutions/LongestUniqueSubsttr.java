package com.codility.solutions;

import java.util.Arrays;

public class LongestUniqueSubsttr {
	static final int NO_OF_CHARS = 256;

	static int longestUniqueSubsttr(String str) {
		int n = str.length();

		int res = 0; // result

		// last index of all characters is initialized
		// as -1
		int[] lastIndex = new int[NO_OF_CHARS];
		Arrays.fill(lastIndex, -1);

		// Initialize start of current window
		int i = 0;

		// Move end of current window
		for (int j = 0; j < n; j++) {

			// Find the last index of str[j]
			// Update i (starting index of current window)
			// as maximum of current value of i and last
			// index plus 1
			i = Math.max(i, lastIndex[str.charAt(j)] + 1);

			// Update result if we get a larger window
			res = Math.max(res, j - i + 1);

			// Update last index of j.
			lastIndex[str.charAt(j)] = j;
		}
		return res;
	}

	static int maxRepeating(String str) {
		int n = str.length();
		int count = 0;

		if(n==0) return count;

		char res = str.charAt(0);
		int cur_count = 1;

		
		// Traverse string except last character
		for (int i = 0; i < n; i++) {
			// If current character matches with next
			if (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
				cur_count++;

			// If doesn't match, update result
			// (if required) and reset count
			else {
				if (cur_count > count) {
					count = cur_count;
					res = str.charAt(i);
				}
				cur_count = 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		System.out.println("The input string is " + str);
		int len = longestUniqueSubsttr(str);
		System.out.println("The length of " + "the longest non repeating character is " + len);
        int len1=maxRepeating("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println("Maximu Repeated Character : " + len1);
	}

}
