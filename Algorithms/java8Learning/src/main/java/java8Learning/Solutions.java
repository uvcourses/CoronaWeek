package java8Learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solutions {
    public int solution(int[] blocks) {
        // write your code in Java SE 8 
        
        // find adjustant 
        
        int start=0;
        
        for(int i=1;i<blocks.length-1;i++) { 
         
            if(blocks[i] <=blocks[i-1] && (blocks[i]<=blocks[i+1]))
            { 
                start=i;
            }
        }
        
        int frog1=0;
        
        for(int j=start;j<blocks.length-1;j++) { 
          if(blocks[j] <=blocks[j+1])
          frog1=j+1;   
        } 
        
        int frog2=0;
        
        for(int k=start;k>0;k--) { 
          if(blocks[k] <=blocks[k-1])
          frog1+=k;   
        } 
        System.out.println((frog1-frog2)+1);
        return (frog1-frog2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutions s=new Solutions();
	//	s.solution(new int [] {10,9,8,7}); 
		String str="Test1";
		System.out.println("Test1".substring(0, str.length()-1));  
		
	//	String T[]= {"Test1","Test2","Test3a","Test3b"}; 
	//	String R[]= {"OK","Run","Wrong","OK"}; 
		
		String T[]= {"T1","T3","T4a","T2","T4b","T6","T5a","T7","T5b"}; 
		String R[]= {"OK","OK","Wrong","Wrong","OK","Wrong","OK","OK","Wrong"}; 

		
		
		List<TestCase> result = new ArrayList<TestCase>();
		for(int i=0;i<T.length;i++) { 
			String str1=T[i];
			if(!Character.isDigit(str1.charAt(str1.length()-1))) {
				result.add(new TestCase(str1.substring(0,str1.length()-1),R[i])); 
			}
			else
			result.add(new TestCase(T[i],R[i])); 
			
		}  
		
	Map<Object, List<TestCase>>	finalResult=result.stream().collect(Collectors.groupingBy(t->t.getTaskName())); 
		System.out.println(result.stream().collect(Collectors.groupingBy(t->t.getTaskName())));
		//result.stream().collect(Collectors.groupingBy())  
		
		Set it=finalResult.keySet(); 
		
		Iterator it1=it.iterator(); 
		int passCount=0;
		int task=0;
		while(it1.hasNext()) { 
			boolean flag=true;
		List<TestCase>	temp=finalResult.get(it1.next()); 
		
		    for(int i=0;i<temp.size();i++) { 
		    	TestCase te=temp.get(i); 
		    	if(!te.getTaskStatus().equalsIgnoreCase("OK")) { 
		    		flag=false;
		    		break;
		    	}
		    }
		    if(flag) { 
	    		passCount=passCount+1;
	    	}
		    task++;
		}
		System.out.println( "result : "+ (passCount*100)/task);
	} 
}
