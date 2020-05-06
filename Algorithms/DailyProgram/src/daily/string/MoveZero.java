package daily.string;

import java.util.Arrays;

public class MoveZero {

	public void moveZeroes(int[] nums) {

		int low = 0;

		for (int i = 0; i < nums.length; i++) {
            
			if(nums[i]!=0) {
				nums[low]=nums[i];
				low++;
			} 
		}
		Arrays.fill(nums, low, nums.length, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZero m = new MoveZero();
		m.moveZeroes(new int[] {1, 3, 12,0,0});
	}

}
