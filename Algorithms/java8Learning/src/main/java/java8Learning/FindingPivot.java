package java8Learning;

public class FindingPivot {

	public int pivotIndex(int[] nums) {

		int first = nums[0];
		int second = nums[nums.length - 1];

		int i = 0, j = nums.length - 1;

		while (i < j) {

			if (first < second) {
				first += nums[++i];
			} else {
				second += nums[--j];
			}
		}

		if (first == second) {
			return i;
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindingPivot p = new FindingPivot();
	//	System.out.println(p.pivotIndex(new int[] { 1, 7, 3, 5, 6, 5 }));
	//	System.out.println(p.pivotIndex(new int[] { 1, 2, 3 }));
		System.out.println(p.pivotIndex(new int[] { -1, -1, -1 ,-1,-1,0}));

	}

}
