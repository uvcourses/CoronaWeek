package daily.string;

import java.util.Arrays;

public class Sqaures {
	 public int[] sortedSquares(int[] A) {
	       
	        int i=0,j=0; 
	        int N=A.length;
	        int result[]=new int[A.length];
	        
	        while(i<N && A[i]<0) 
	        		i++;
	        
	        j=i-1;

	        int x=0;  
	        
	        while(i>=0 && j<N) { 
	        	
	        	if(A[i] * A[i] < A[j]* A[j]) { 
	        		result[x++]=A[i] * A[i];
	        		i--;
	        	}else { 
	        		result[x++]=A[j] * A[j];
	        		j++;
	        	}
	        }
	        while(j<N) { 
	        	result[x++]= A[j] * A[j];
	        	j++;
	        }
	        
	        while(i>=0) { 
	        	result[x++]= A[i] * A[i];
	        }
	       
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Sqaures s=new Sqaures();
		s.sortedSquares(new int [] {-2,-1});

	}

}
