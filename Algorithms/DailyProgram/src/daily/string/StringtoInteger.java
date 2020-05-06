package daily.string;

public class StringtoInteger {

	public int myAtoi(String str) {
        long result=0; 
        boolean isNegative=false;
        int i=0;
        
        if(str.length()==0)
        	return 0;
        
        if(Character.isAlphabetic(str.charAt(0))) 
            return 0;
        
        while(i<str.length()) { 
        	
        	if(Character.isDigit(str.charAt(i))) { 
        	    int digit=str.charAt(i)-'0'; 
        	    
        		result=result*10+digit; 
        	}
        	  if(str.charAt(i)=='.') { 
          		break;
          	}
        	if(str.charAt(i)=='-') { 
        		isNegative=true;
        	}
        	i++;
        }
        //2147483648 
        
        if(isNegative) 
        	result=result*(-1);

	    if(  result >Integer.MAX_VALUE ) { 
        	result=Integer.MAX_VALUE;
        }else if(result < Integer.MIN_VALUE) { 
        	result=Integer.MIN_VALUE;
        }
	    
        return (int)result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringtoInteger s=new StringtoInteger(); 
		System.out.println(s.myAtoi(""));
		
	}

}
