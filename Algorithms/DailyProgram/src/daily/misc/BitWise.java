package daily.misc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {0,1,2};
		
       /**  for(int i=0;i<8;i++) { 
        	 for(int j=0;j<3;j++) { 
        		 System.out.println(1 << j);
        		 if((i & (1 << j)) > 0) {
        			// System.out.print(a[j]);
        		 }
        	 }
        //	 System.out.println(); 
         }**/ 
		
		int n=(int) Math.pow(2, 3);
		
		Set<List<Integer>> set = new HashSet<>();
		 for(int j=0;j<10;j++) { 
		 System.out.println(1<<j); 	
		 }
		
	}

}
