package daily.search;

public class FirstOccurance { 
	
	public int bSearch(int arr[],int k) { 
		
		int l=0,u=arr.length-1; 
		
		int result=-1;
		
		while(l<=u) { 
			int m=l+(u-l)/2; 
			
			if(arr[m] > k) { 
				u=m-1; 
			}else if(arr[m]==k) { 
				result=m;
				u=m-1;
			} else { 
				l=m+1;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstOccurance f=new FirstOccurance(); 
		
	System.out.println(f.bSearch(new int[] {-14,-10,2,108,108,243,285,285,285,401},108));
	}

}
