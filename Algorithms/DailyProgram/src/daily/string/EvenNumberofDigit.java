package daily.string;

public class EvenNumberofDigit {

	public int findNumbers(int[] nums) {

		int result = 0;

		for (int i = 0; i < nums.length; i++) {
         
			String str=String.valueOf(nums[i]); 
			
			if(str.length()%2 ==0) { 
				
				result++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 555,901,482,1771};
		EvenNumberofDigit em = new EvenNumberofDigit();
		em.findNumbers(nums);
	}

}
