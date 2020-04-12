package daily.string.DataStructure.common;

import java.util.LinkedList;
import java.util.Queue;

/* Class containing left and right child of current 
node and key value*/

//A Java program to introduce Binary Tree 
public class BinaryTree {
	// Root of Binary Tree
	static Node root;

	// Constructors
	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	public static void printAverageEachLevel(Node root) {
		Queue<Node> queue = new LinkedList<Node>();

		int sum = 0;
		int count = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			Queue<Node> temp = new LinkedList<Node>();
			while (!queue.isEmpty()) {
				Node node = queue.poll();
				sum += node.key;
				count++;

				if (node.left != null)
					temp.add(node.left);

				if (node.right != null)
					temp.add(node.right);

			}
			queue = temp;
			System.out.println(sum / count);
			sum = 0;
			count = 0;
		}

	}
	public static void printLevelOrder(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {

			Node temp = queue.poll();

			System.out.println(temp.key);

			if (temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);

		}

	}
 public static void main(String[] args) 
 { 
     BinaryTree tree = new BinaryTree(); 

     /*create root*/
     tree.root = new Node(1); 

     /* following is the tree after above statement 

           1 
         /   \ 
       null  null     */

     tree.root.left = new Node(2); 
     tree.root.right = new Node(3); 
     tree.root.right.left=new Node(5);
     tree.root.right.right=new Node(15);
     /* 2 and 3 become left and right children of 1 
            1 
          /   \ 
         2      3 
       /    \    /  \ 
     null null null null  */


     tree.root.left.left = new Node(4); 
     tree.root.left.right = new Node(14); 
     /* 4 becomes left child of 2 
                 1 
             /       \ 
            2          3 
          /   \       /  \ 
         4    null   5  15  
        /   \ 
       null null 
      */ 
     tree.root.left.left.left=new Node(10);
     tree.root.left.left.right=new Node(20); 
     
     /* 10 becomes left child of 4 
     		1 
 		/       \ 
		2          3 
	  /   \       /  \ 
	 4    14  	 5  15 
	/   \ 
   10   20 
*/ 
   //  printLevelOrder(root); 
     printAverageEachLevel(root);
 } 
} 