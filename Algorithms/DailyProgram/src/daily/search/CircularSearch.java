package daily.search;

public class CircularSearch {

	public int circularSmallSearch(int ar[]) { 
		int result =-1; 
		
		int left=0;
		int right=ar.length-1; 
		
		while(left <right) { 
			int m= (left + (right-left) /2 ); 
			
			if(ar[m] >ar[right]) { 
				left=m+1;
			}else { 
				right=m;
			}
			
		}
		return left;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSearch c=new CircularSearch(); 
		System.out.println(c.circularSmallSearch(new int[] {378,478,550,631,731,831,220,234,279,368}));
	}

}
