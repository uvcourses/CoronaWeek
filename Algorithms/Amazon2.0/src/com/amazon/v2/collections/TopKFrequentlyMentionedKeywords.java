package com.amazon.v2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequentlyMentionedKeywords {
	public List<String> frequently(List<String> reviews, List<String> keywords, int k) {

		List<String> result = new ArrayList<String>();

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String keys : keywords) {
			map.put(keys, 0);
		}

		for (int i = 0; i < reviews.size(); i++) {

			Set<String> visited = new HashSet<String>();
			String str[] = reviews.get(i).split(" ");

			for (String words : str) {

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

		for (Map.Entry<String, Integer> p : map.entrySet()) {
			priority.add(p.getKey());
		}

		int t = 0;
		while (t < k) {

			result.add(priority.poll());
			t++;
		}

		return result;
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<String>(); 
		keywords.addAll(Arrays.asList( "anacell", "betacellular", "cetracular", "deltacellular", "eurocell")); 
		
		List<String> reviews = new ArrayList<String>();
		reviews.addAll(Arrays.asList("I love anacell Best services; Best services provided by anacell",
				"betacellular has great services", "deltacellular provides much better services than betacellular",
				"cetracular is worse than anacell", "Betacellular is better than deltacellular."));

		TopKFrequentlyMentionedKeywords t = new TopKFrequentlyMentionedKeywords();
		System.out.println(t.frequently( reviews, keywords, 2));
	}
}
