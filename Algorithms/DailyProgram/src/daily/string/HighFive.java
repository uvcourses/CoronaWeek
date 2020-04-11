package daily.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HighFive {

	public int[][] highFive(int[][] items) {

		Arrays.sort(items ,(a,b)-> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
		System.out.println(items[items.length-1][0]);
		int item=items[items.length-1][0];
	    int newArray[][]=new int[item][2];
	
		int ID=items[0][0];
		int count=0,sum=0;
		
		for(int i=0;i<items.length;i++) { 
			
			if(count!=5 && items[i][0]==ID) { 
				sum+=items[i][1];
				count++;
			}
			if(count==5) { 
				
				newArray[ID - 1][0]=ID;
				newArray[ID++ - 1][1]=sum/5;
				sum=0;
				count=0;
			}
			
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighFive h = new HighFive();
		int a[][] = { { 1, 91 }, { 1, 92 }, { 2, 93 }, { 2, 97 }, { 1, 60 }, { 2, 77 }, { 1, 65 }, { 1, 87 },
				{ 1, 100 }, { 2, 100 }, { 2, 76 } };
		// Output: [[1,87],[2,88]]

		h.highFive(a);
	}

}
