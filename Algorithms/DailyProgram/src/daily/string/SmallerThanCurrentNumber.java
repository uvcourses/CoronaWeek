package daily.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallerThanCurrentNumber {
	
	 public int[] smallerNumbersThanCurrent(int[] nums) {
		 
		 int result[]=new int[nums.length]; 
		 List<Integer> numbersList = new ArrayList<Integer>();
         
	        
		 for(int i:nums) { 
			 numbersList.add(i);
		 }
		 
	        Collections.sort(numbersList);
	        
	        int r=0;
		 
		 for(int j=0;j< nums.length;j++) { 
			 
			result[j]= numbersList.indexOf(nums[j]);
			 
		 }
		 
		 return result;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		SmallerThanCurrentNumber s=new SmallerThanCurrentNumber();  
		
		int input[]= { 8,1,2,2,3}; 
		System.out.println(s.smallerNumbersThanCurrent(input));

	}

}
