package Test_Programs_advanced;

class Node{
	int data;
	Node left;
	Node right;
}

class BSTNew{
	
	public Node createnewNode(int k) {
		Node a = new Node();
		a.left = null;
		a.right = null;
		a.data = k;
		return a;
		
	}
	public Node insert(Node node, int val) {
		if(node == null) {
			return createnewNode(val);
		}
		if(val <node.data) {
			node.left= insert(node.left,val);
		}else
			if(val > node.data) {
				node.right = insert(node.right,val);
			}
		return node;
	}
	
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	}
	

public class BST {
	public static void main(String[] args) {
		BSTNew a = new BSTNew();
		Node root = null;
		root = a.insert(root, 8);
		root = a.insert(root, 8);
	    root = a.insert(root, 3);
	    root = a.insert(root, 6);
	    root = a.insert(root, 10);
	    root = a.insert(root, 4);
	    root = a.insert(root, 7);
	    root = a.insert(root, 1);
	    root = a.insert(root, 14);
	    root = a.insert(root, 13);
	    a.inorder(root);
		
	}
}
