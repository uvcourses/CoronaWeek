package com.amazon.v2.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentlyMentionedKeywords {

	public String[] frequently(String[] reviews, String[] keywords, int k) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String keyString : keywords) {
			map.put(keyString, 0);
		}

		for (int i = 0; i < reviews.length; i++) {
			HashSet visited = new HashSet();
			String[] split = reviews[i].split(" ");
			for (String words : split) {
				words = words.toLowerCase();

				if (map.containsKey(words)) {
					if (!visited.contains(words)) {
						map.put(words, map.getOrDefault(words, 0) + 1);
					}
					visited.add(words);
				}
			}
		}
		PriorityQueue<String> priority = new PriorityQueue<String>(k,
				(a, b) -> (map.get(b) == map.get(a) ? a.compareTo(b) : map.get(b) - map.get(a)));

		for (Map.Entry<String, Integer> mapKey : map.entrySet()) {
			priority.add(mapKey.getKey());
		}

		String result[] = new String[k];

		int t = 0;

		while (t < k) {
			result[t] = priority.poll();
			System.out.println(result[t]);
			t++;

		}
		
		return result;

	}

	public static void main(String[] args) {
	//	String[] keywords = { "anacell", "cetracular", "betacellular" };
	//	String[] reviews = { "Anacell provides the best services in the city", "betacellular has awesome services",
	//			"Best services provided by anacell, everyone should use anacell" };
		String[] keywords = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"};
		String[] reviews= {
				  "I love anacell Best services; Best services provided by anacell",
				  "betacellular has great services",
				  "deltacellular provides much better services than betacellular",
				  "cetracular is worse than anacell",
				  "Betacellular is better than deltacellular.",
		};

		
		
		
		TopKFrequentlyMentionedKeywords t = new TopKFrequentlyMentionedKeywords();
		System.out.println(t.frequently(reviews, keywords, 2));
	}

}
