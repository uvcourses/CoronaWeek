package com.amazon.v2.arrays;

import java.util.Arrays;
import java.util.Comparator;


public class ReOrderLogFiles {

	public String[] reorderLogFiles(String[] logs) {

		if (logs.length == 0) {
			return logs;
		}

		Comparator<String> logFileComparator = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				String subString1 = str1.substring(str1.indexOf(' ') + 1);
				String subString2 = str2.substring(str2.indexOf(' ') + 1);
				if (subString1.charAt(0) <= '9') {
					if (subString2.charAt(0) <= '9') {
						return 0;
					} else {
						return 1;
					}
				}
				if (subString2.charAt(0) <= '9') {
					return -1;
				}

				int stringComparison = subString1.compareTo(subString2);
				if (stringComparison == 0) {
					return str1.substring(0, str1.indexOf(' ') - 1).compareTo(str2.substring(0, str2.indexOf(' ') - 1));
				}
				return stringComparison;
			}
		};
		Arrays.sort(logs, logFileComparator);
		return logs;
	}

	public static void main(String[] args) {
		ReOrderLogFiles R = new ReOrderLogFiles();

		String logs[] = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
		String out[] = R.reorderLogFiles(logs);

		for (String ss : out) {
			System.out.println(ss);
		}

	}

}
