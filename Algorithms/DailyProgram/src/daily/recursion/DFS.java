package daily.recursion;

import java.util.ArrayList;
import java.util.List;

public class DFS {

	
	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsetHelper(nums,result, new ArrayList<Integer>(), 0);
        return result;
    }
    
    private void subsetHelper(int[] nums,List<List<Integer>> result,List<Integer> slate, int n){
        if(n==nums.length){
            result.add(slate);
            return;
        }
        
        subsetHelper(nums, result, new ArrayList<Integer>(slate), n+1);
        slate.add(nums[n]);
        subsetHelper(nums, result,  new ArrayList<Integer>(slate), n+1);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS d=new DFS(); 
		d.subsets(new int[] {0,1,2});
		
	}

}
