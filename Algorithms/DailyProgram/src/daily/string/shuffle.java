package daily.string;

public class shuffle {

	public int[] shuffle(int[] nums, int n) {

		int result[] = new int[nums.length];
		int j = 0;
		for (int i = 0; i < n; i++) {

			result[j++] = nums[i];
			result[j++] = nums[n + i];

		}
		return result;
	}

	public int divide(int dividend, int divisor) {
		int count = 0;
		int sign = 0;
		
		 if (dividend == Integer.MIN_VALUE && divisor == -1) {
		        return Integer.MAX_VALUE;
		    }
		 
		   if(dividend < 0) { 
			   sign++; 
			   dividend=-dividend;
		   }
		   
		   if(divisor < 0) { 
			   sign++; 
			   divisor=-divisor;
		   } 
		   
		   while(dividend >= divisor) { 
			   
			   int value =divisor; 
			   int powerSet=1;
			   
			   while(value+value < dividend) { 
				   powerSet+=powerSet;
				   value+=value;
			   }
			   count+=powerSet;
			   dividend-=value;
		   }
		   
		   if(sign==1) { 
			   count=-count;
		   }
		   
		return count ;
	}
	
	public int div() { 
		
		System.out.println( 10 >>1 ); 
		
		return 10 >>1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shuffle s = new shuffle();

		s.shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3); 
		s.divide(-7, -3);
		s.div();
		
	}

}
