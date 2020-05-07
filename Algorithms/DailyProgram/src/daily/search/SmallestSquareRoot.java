package daily.search;

public class SmallestSquareRoot { 
	
	public int smallestSquare(int k) { 
		
		int left=0;
		int right=k; 
		
		while(left<=right) { 
			
			int m= (left + (right-left)/2);
			int square=m*m; 
			
			if(square<=k) { 
				left=m+1;
			}else { 
				right=m-1;
			}
		}
		
		System.out.println(left-1);
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestSquareRoot s=new SmallestSquareRoot(); 
		s.smallestSquare(16);
	}

}
