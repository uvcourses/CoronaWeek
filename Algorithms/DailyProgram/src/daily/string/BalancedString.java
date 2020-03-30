package daily.string;

public class BalancedString {
	public int balancedStringSplit(String s) {
char starting = ' ';
        
        int startCounter = 0;
        int otherCounter = 0;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            if(starting == ' '){
                starting = c;
                startCounter++;
            }
            else{
                if(c == starting){
                    startCounter++;
                }
                else{
                    otherCounter++;
                }

                if(startCounter == otherCounter){ 
                    answer++;
                    startCounter = 0;
                    otherCounter = 0;
                    starting = ' ';
                }
            }
            
        }
        
        return answer;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedString b=new BalancedString(); 
		b.balancedStringSplit("RLRRLLRLRL"); 
		b.balancedStringSplit("RLLLLRRRLR"); 
		b.balancedStringSplit("LLLLRRRR"); 
		b.balancedStringSplit("RLRRRLLRLL"); 
	}

}
