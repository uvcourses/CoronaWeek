package daily.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsCandy {
	
	 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> result=new ArrayList<Boolean>(); 
	        int max=Integer.MIN_VALUE;
	        
	        for(int i=0;i<candies.length;i++) {
	        	max=Math.max(max,candies[i]); 
	        }
	        for(int i=0;i<candies.length;i++) {
	        	int r=candies[i]+extraCandies;
	        	if( r >=max ) { 
	        		result.add(true);
	        	}else { 
	        		result.add(false);
	        	}
	        	
	        }
	        
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		KidsCandy k=new KidsCandy(); 
		k.kidsWithCandies(new int[] {2,3,5,1,3}, 3);
		

	}

}
