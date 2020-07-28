package daily.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class KLargestElement { 
	
	private static class GreaterThan implements Comparator<Integer>{

		@Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			return (a >b) ? -1 : (a.equals(b)) ? 0:1;
		}
	}
	public static final GreaterThan com=new GreaterThan();
	
	public static int findKthLargest(List<Integer> A,int k,Comparator<Integer> cmp) { 
		return findkth(A,k,KLargestElement.com);
	}
	
	public static int findkth(List<Integer> A,int k,Comparator<Integer> cmp) { 
		int left=0;
		int right=A.size()-1;
		Random r=new Random(0);  
		
		while(left <=right) { 
			int pivotIdx=r.nextInt(right-left+1)+left; 
			int newPivotInx=partitionAroundPivot(left,right,pivotIdx,A,cmp);
			if(newPivotInx==k-1) { 
				return A.get(newPivotInx);
			} 
			else if(newPivotInx>k-1) { 
				right=newPivotInx-1; 
			} else { 
				left=newPivotInx+1;
			}
		}
		return -1;
	}
   private static int partitionAroundPivot(int left,int right,int pivotIdx,List<Integer> A,Comparator<Integer> cmp) { 
	   int pivotValue=A.get(pivotIdx); 
	   int newPivotIdx=left; 
	   Collections.swap(A, pivotIdx, right); 
	   
	   for(int i=left;i<right;++i) { 
		   if(cmp.compare(A.get(i), pivotValue)<0) { 
			   Collections.swap(A,i,newPivotIdx++);
		   }
	   }
	   Collections.swap(A, right, newPivotIdx); 
	   return newPivotIdx;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KLargestElement k=new KLargestElement(); 
		List<Integer> list=new ArrayList<Integer>(); 
		list.add(4);
		list.add(2);
		list.add(1); 
		list.add(5);
		list.add(3);
		System.out.println(findKthLargest(list, 2,com));
	}
}
