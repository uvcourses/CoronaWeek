package daily.string.DataStructure;

import daily.string.DataStructure.common.*;

public class ValidBinaryTree {

	public boolean isValidBST(Node root) {
		return helper(root,null,null);
	}
	
	private boolean helper(Node root,Integer lower,Integer upper) { 
		boolean result = true;
		if (root == null) {
			return true;
		}
		
		int val=root.key;
     
		if(lower!=null && val<=lower) return false; 
		
		if(upper!=null && val >=upper) return false;  
		
		if(!helper(root.right,val,upper)) { 
			return false;
		}
		if(!helper(root.left,lower,val)) return false; 
		
		
	//	System.out.println(result);
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
		ValidBinaryTree v = new ValidBinaryTree();

		System.out.println(v.isValidBST(root));

	}

}
