package daily.misc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Comparator<Integer> compare=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			} 
			
		};
		
		PriorityQueue priority=new PriorityQueue(compare); 
        priority.add(100);
        priority.add(10); 
        priority.add(20); 
        
        System.out.println(priority);
	}

}
