package daily.string.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recursion { 
	
	public static List<List<Integer>> permutation(List<Integer> A) { 
		
		List<List<Integer>> result=new ArrayList<>();
		
		directedPermutations(0,A,result);
		
		return result; 
	}
private static void directedPermutations(int i,List<Integer> A,List<List<Integer>> result) { 
	
	if(i==A.size()-1) { 
		result.add(new ArrayList<>(A));
		return;
	}
	
	for(int j=i;j<A.size();j++) { 
		Collections.swap(A, i, j);
		directedPermutations(i+1, A, result);
		Collections.swap(A, i, j);

	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r=new Recursion();
		r.permutation(Arrays.asList(7,3,5));

	}

}
