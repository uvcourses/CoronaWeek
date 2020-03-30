package daily.string;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreation {

	public int[] createTargetArray(int[] nums, int[] index) {

		List<Integer> targetList = new ArrayList<Integer>();

		for (int i = 0; i < index.length; i++) {
			targetList.add(index[i], nums[i]);
		}
		int target[] = new int[targetList.size()];

		// ArrayList to Array Conversion
		for (int i = 0; i < targetList.size(); i++)
			target[i] = targetList.get(i);
		return target;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCreation arr = new ArrayCreation();
		int nums[] = { 0, 1, 2, 3, 4 };
		int index[] = { 0, 1, 2, 2, 1 };

		arr.createTargetArray(nums, index);

	}

}
