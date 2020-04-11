package daily.string;

public class NumberConversition {

	public String inttoString(int input) {
		StringBuffer str = new StringBuffer();
		boolean isNegative = false;

		if (input <0)
			isNegative = true;

		while (input != 0) {
			str.append((char)('0'+ Math.abs(input % 10)));
			input = input / 10;
		}
		return isNegative == true ? str.append("-").reverse().toString() : str.reverse().toString();
	}

	public int stringtoInt(String input) {
		int result = 0;

		for (int i = input.charAt(0) == '-' ? 1 : 0; i < input.length(); i++) {
			int digit = input.charAt(i)-'0';
			result = result * 10 + digit;
		}

		return input.charAt(0) == '-' ? -result : result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberConversition n = new NumberConversition();
		System.out.println(n.inttoString(3198764)); 
		System.out.println(n.stringtoInt("-3198764"));
	}

}
