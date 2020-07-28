package com.amazon.v2.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class suggestedProducts {

	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
      int N=searchWord.length();
		List<List<String>> result = new ArrayList<List<String>>(N);
		PriorityQueue<String> priority = new PriorityQueue<String>((a, b) -> b.compareTo(a));

		for (int i = 1; i <=searchWord.length(); i++) {

			String str = searchWord.substring(0, i);

			for (String prod : products) {
				if (prod.startsWith(str)) {
					priority.offer(prod);
				}
				if (priority.size() > 3) {
					priority.poll();
				}
			}
			List<String> list = new ArrayList<>(3);

			while (!priority.isEmpty()) {
				list.add(0, priority.poll());
			}
			result.add(list);
		}
		return result;
	} 
	
	public List<List<String>> suggestedProducts1(String[] products, String searchWord) {
        
        int N = searchWord.length();
       
       List<List<String>> ans = new ArrayList<>(N);
       
        PriorityQueue<String> q = new PriorityQueue<>((a,b) -> b.compareTo(a));
       
       for(int i = 1 ; i <= N ;i++){
           
           String term = searchWord.substring(0,i);
           
           for(String s : products){
               
               if(s.startsWith(term)){
                   q.offer(s);
               }
               
               if(q.size() > 3){
                   q.poll();
               }
           }
           
           List<String> list = new ArrayList<>(3);
           
           while(!q.isEmpty()){
               list.add(0,q.poll());
            }    
         ans.add(list);
       }
     return ans;  
}

	public static void main(String[] args) {
		String products[] = { "mobile", "mouse", "moneypot", "monitor", "mousepad" };

		suggestedProducts s = new suggestedProducts();
		s.suggestedProducts(products, "mouse");
	}

}
