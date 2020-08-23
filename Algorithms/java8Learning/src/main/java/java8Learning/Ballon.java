package java8Learning;

public class Ballon {
	 public int solution(String S) {
	        // write your code in Java SE 8 
	        
	        if(S==null || S.length()==0) { 
	            return 0;
	        } 
	        int []count=new int[26]; 
	        
	        for(int i=0;i<S.length();i++) { 
	            count[S.charAt(i)-'A']++;
	            
	        }
	        int min=Integer.MAX_VALUE;
	        min=Math.min(count['B'-'A'],min);
	        min=Math.min(count['B'-'A'],min);
	        Math.min(count['L'-'B']/2,min);
	        Math.min(count['O'-'A']/2,min);
	        Math.min(count['N'-'A'],min);
	        
	        System.out.println(min);
	       return min;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ballon b=new Ballon(); 
		b.solution("QAWABAWONL");
	}

}
