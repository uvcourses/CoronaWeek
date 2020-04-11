package daily.string;

import java.util.Arrays;

public class Sqaures {
	 public int[] sortedSquares(int[] A) {
	       
	        
	        for(int i=0;i<A.length;i++) { 
	         A[i]= A[i] * A[i];  
	         
	        }
	        Arrays.sort(A);
	        
	        return A;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Sqaures s=new Sqaures();
		s.sortedSquares(new int [] {-4,-1,0,3,10});

	}

}
