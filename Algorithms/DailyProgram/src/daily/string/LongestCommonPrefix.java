package daily.string;

import java.util.Arrays;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {

		int len = strs.length;
		int i = 0;
		int j = 0;
		StringBuffer result = new StringBuffer();
		String str = "";

		if (len > 1)
			str = strs[0];
		else if(len==1)
			return strs[0];
		else 
			return result.toString();
		

		while (i < str.length() ) {
			j = 0;
			while (j < len) {
				if (str.charAt(i) == strs[j].charAt(i)) {
					j++;
				} else {
					i=-1;
					break;
				}
			}
			
			if (i >= 0) {
				result.append(str.charAt(i));
				i++;
			}
			else
				break;
		}
System.out.println(result);
		return result.toString();
	}

	public static void main(String[] args) {
		LongestCommonPrefix l = new LongestCommonPrefix();
		System.out.println(l.longestCommonPrefix(new String[] { "a","a"}));
	}

}
