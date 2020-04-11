package daily.string;

public class CountofSubString {

	public int countLetters(String S) {

		int result = 1;
		int j = 0, k = 0;
		StringBuffer str = new StringBuffer();
		char previous = S.charAt(0);
		str.append(previous);

		for (int i = 1; i < S.length(); i++) {
			char current = S.charAt(i);
			if (current == previous) {
				result += 2;
				str.append(current);
			} else {
				if (str.length() >= 2) {
					result += 2;
					str = new StringBuffer();
					;
				} else {
					result += 1;
				}
			}
			previous = current;

		}
		System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountofSubString c = new CountofSubString();
		c.countLetters("aaaaaaaaaa");
	}

}
