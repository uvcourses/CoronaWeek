package daily.misc;

import java.util.Arrays;

public class TwoDSorting { 
	
	
	public void sorting (int ar[][]) { 
		System.out.println(ar);
		Arrays.sort( ar,(a,b)-> a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
		System.out.println(ar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDSorting t=new TwoDSorting(); 
		int ar[][]=new int[][] {{4,90},{12,88},{13,43},{1,87},{2,99},{3,100}};
	     t.sorting(ar);
	}

}
