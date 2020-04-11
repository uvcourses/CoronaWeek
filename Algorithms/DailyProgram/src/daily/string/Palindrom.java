package daily.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Palindrom {

	public static List<List<String>> findAnagrams(List<String> dictionary) {

		Map<String, List<String>> result = new HashMap<String, List<String>>();
		List<List<String>> anagram = new ArrayList<>();
		for (String s : dictionary) {

			char c[] = s.toCharArray();
			Arrays.sort(c);
			String str = new String(c);
			if (result.containsKey(str)) {
				result.get(str).add(s);
			} else {
				result.put(str, new ArrayList<String>());
			}
		}
		for (Map.Entry<String, List<String>> p : result.entrySet()) {

			if (p.getValue().size() >= 2) {
				anagram.add(p.getValue());
			}
		}
		System.out.println(anagram);
		return anagram;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom p = new Palindrom();
		List<String> dict = new ArrayList<String>();
		dict.add("debitcard");
		dict.add("elvis");
		dict.add("silent");
		dict.add("badcredit");
		dict.add("lives");
		dict.add("freedom");
		dict.add("listen");
		dict.add("levis");
		dict.add("money");
		p.findAnagrams(dict);
	}
}
