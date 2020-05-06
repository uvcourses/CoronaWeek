package daily.string;

public class MaxSubArray {

	public int maxSubArray(int[] nums) {
		int size = nums.length;
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + nums[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArray m = new MaxSubArray();
		int nums[] = new int[] { -2, -1 };
		System.out.println(m.maxSubArray(nums));
	}
}
