package practice.java.coderpad1;


class Node{
	int data;
	Node left;
	Node right;
}

class BinaryTree{
	public Node createnewnode(int k) {
		Node a = new Node();
		a.left= null;
		a.right = null;
		a.data=k;
		return a;
	}
	public Node insertnode(Node node,int val) {
		if(node == null) {
			return createnewnode(val);
		}
		if(val<node.data) {
			node.left = insertnode(node.left, val);
		}
		else {
			node.right = insertnode(node.right, val);
		}
		return node;
	}
	
	public void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
			
		}
	}
	
}

public class BST {
	public static void main(String[] args) {
		BinaryTree a = new BinaryTree();
		Node root = null;
		root = a.insertnode(root, 8);
		root = a.insertnode(root, 8);
	    root = a.insertnode(root, 3);
	    root = a.insertnode(root, 6);
	    root = a.insertnode(root, 10);
	    root = a.insertnode(root, 4);
	    root = a.insertnode(root, 7);
	    root = a.insertnode(root, 1);
	    root = a.insertnode(root, 14);
	    root = a.insertnode(root, 13);
	    root = a.insertnode(root, 9);
	    a.inorder(root);
		
	}
}
