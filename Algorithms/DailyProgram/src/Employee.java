
class Node { 
	
	Node next; 
	int data;
	Node(int data) { 
		this.data=data;
		this.next=null;
	}
}
public class Employee { 
	
	static Node header; 
	
	public void insertNode(int data) { 
		Node current; 
		if(header==null) { 
			header=new Node(data);
		} 
		else { 
			
			current=header; 
			
			while(current.next!=null) { 
				
				current=current.next; 
			}
			current.next=new Node(data);
		}
	}
	
	public void printList() { 
		
		Node current=header; 
		
		while(current!=null) { 
			System.out.println(current.data);
			current=current.next; 
		}
		
	}
	public void reverse(Node header) { 
		
		if(header==null) { 
			return;
		}
		
		reverse(header.next);
		System.out.println(header.data);
		
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.insertNode(10);
		e.insertNode(20);
		e.insertNode(30);
		e.insertNode(40);
		e.insertNode(50);
		e.printList();
		e.reverse(header);
		
	}

}
