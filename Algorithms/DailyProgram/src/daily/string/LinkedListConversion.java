package daily.string;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class LinkedListConversion {
	
 
	 public int getDecimalValue(ListNode head) {
	        
	        ListNode current=head; 
	        int length=0;
	        int result=0;
	        while(current!=null)  { 
	        	current =current.next; 
	        	length++;
	        }
	        ListNode temp=head; 
	        while(temp!=null) {
	        length=length-1;
	        if(temp.val!=0)
        	result+=Math.pow(2, length);
	        
	        temp =temp.next; 
        }
	        return result;
	    } 
	    public int getHelper(ListNode node,int count,int result) { 
	        if(node==null) { 
	        return 0;
	        }
	          result += getHelper(node.next,count++,result); 
	        if(node.val!=0) { 
	         result= (int) Math.pow(node.val, count);
	          count++;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode first=new ListNode(0);
		
		
		LinkedListConversion node=new LinkedListConversion(); 
		node.getDecimalValue(first);

	}

}
