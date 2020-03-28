package daily.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallerThanCurrentNumber {
	
	 public int[] smallerNumbersThanCurrent(int[] nums) {
		 
		 
	        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
	        int[] outPut = new int[nums.length];
	        int[] tmpArray = nums.clone();
	        java.util.Arrays.sort(tmpArray);
	        int comCnt = 0;

	        for (int i = 0; i < nums.length; i++) {
	            if (!map.containsKey(tmpArray[i])) {
	                map.put(tmpArray[i], i);
	                if (map.containsKey(nums[comCnt])) {
	                    outPut[comCnt] = map.get(nums[comCnt]);
	                    comCnt++;
	                }
	            }
	        }

	        for (int x = comCnt; x < nums.length; x++) {
	            outPut[x] = map.get(nums[x]);
	        }

	        return outPut;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		SmallerThanCurrentNumber s=new SmallerThanCurrentNumber();  
		
		int input[]= { 8,1,2,2,3}; 
		System.out.println(s.smallerNumbersThanCurrent(input));

	}

}
