package daily.leetcode;

import java.util.Comparator;
import java.util.Random;

public class KLargest {

	int findKthLargest(int[] nums, int k) {
		int left = 0;
		int right = nums.length - 1;
		Random r = new Random(0);
		while(left <=right) {
		int pivot = r.nextInt(right - left+1) + left;

		int newPivot = findPivot(nums, left, right, pivot);

		if (newPivot == k - 1) {
			return nums[newPivot];
		} else if (newPivot > k - 1) {
			right = newPivot - 1;
		} else {
			left = newPivot + 1;
		}
		}
		return -1;
	}

	public int findPivot(int nums[], int left, int right, int pivot) {

		int newPivot = left;
		int pivotValue = nums[pivot];
		swap(nums, pivot, right);
		for (int i = left; i < right; i++) {
			if(nums[i]> pivotValue) {
				swap(nums, i, newPivot++);
			}
		}
		swap(nums, right, newPivot);

		return newPivot;
	}

	public void swap(int nums[], int s, int d) {
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KLargest k=new KLargest(); 
		System.out.println(k.findKthLargest(new int[] {4,2,1,5,3},2));
	}

}
