package daily.search;

public class BinarySearching { 
	
	
	
	public int bSearch(int ar[],int k) { 
		
		int L=0; 
		int U=ar.length-1; 
		
		while( L <=U)  { 
			int M= (L+(U-L) )/2; 
			
			if(ar[M] < k) { 
				L=M+1;
			} else if(ar[M]==k) { 
				return M; 
			}else { 
				U=M-1;
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		BinarySearching b=new BinarySearching();
		
	System.out.println(	b.bSearch(new int[] {2,5,8,12,16,23,38,72,56,72,91},23));

	}

}
