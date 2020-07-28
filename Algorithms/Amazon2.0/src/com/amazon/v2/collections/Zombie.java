package com.amazon.v2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zombie { 
	
	private static int minDays(int rows,int col,List<List<Integer>> matrix) {  
		
		int human=0;
		int days=0; 
		Queue<int[]> queue=new LinkedList<>(); 
		
		for(int i=0;i<rows;i++) { 
			for(int j=0;j<col;j++) { 
				if(matrix.get(i).get(j)==0) { 
					human++;
				}else { 
					queue.add(new int[] {i,j});
				}
			}
		}
		
		
		while(!queue.isEmpty() && human>0) { 
			int size=queue.size(); 
			for(int i=0;i<size;i++) { 
				int curr[]=queue.poll(); 
				int direction[][]= {{0,1},{1,0},{0,-1},{-1,0}}; 
				
				for(int dir[]:direction) { 
					int newX=curr[0]+dir[0]; 
					int newY=curr[1]+dir[1]; 
					
					if(newX>=0 && newX<rows && newY >=0 && newY < col && matrix.get(newX).get(newY)==0) { 
						matrix.get(newX).set(newY,1); 
						queue.add(new int[] {newX,newY}); 
						human--;
					}
				}
			}
			days++;
		}
		
		return human >0 ? -1 : days;
		
	}

	public static void main(String[] args) {
		Zombie z = new Zombie();
	//	int matrix[][] = { { 0, 1, 1, 0, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 } };
		
		
		
		List<List<Integer>> matrix=new ArrayList<List<Integer>>(); 
		
		matrix.add(Arrays.asList(0, 1, 1, 0, 1)); 
		matrix.add(Arrays.asList(0, 1, 0, 1, 0 )); 
		matrix.add(Arrays.asList(0, 0, 0, 0, 1 )); 
		matrix.add(Arrays.asList(0, 1, 0, 0, 0 )); 

		
		System.out.println(z.minDays(4,5,matrix));
	}

}
