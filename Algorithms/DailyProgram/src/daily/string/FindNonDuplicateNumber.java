package daily.string;

import java.util.Arrays;

public class FindNonDuplicateNumber {
     
	public int singleNumber(int[] nums) { 
		
		Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
        	int index = Arrays.binarySearch(nums, i + 1, nums.length, nums[i]);
			if (index > 0) {
				nums[i] = 00;
				nums[index] = 00;
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 00) {
				return nums[j];
			}
		}
		return 0;
    }
	
	static int findSingle(int ar[], int ar_size) 
    { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) 
            res = res ^ ar[i]; 
      
        System.out.println(res);
        return res; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNonDuplicateNumber f = new FindNonDuplicateNumber();
		int nums[]=new int[] {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
	//	System.out.println(f.singleNumber(nums));
	    findSingle(nums,nums.length); 
	    
	    System.out.println(0 ^ 17);
	
	}

}
