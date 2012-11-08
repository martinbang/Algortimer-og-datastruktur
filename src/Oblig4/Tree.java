package Oblig4;

//class Tree definition
public class Tree {
	
	public TreeNode root;

	// constructor initializes an empty Tree of integers
	public Tree() {
		root = null;
	} // end Tree no-argument constructor
		// insert a new node in the binary search tree

	public void insertNode(int insertValue) {
		if (root == null)
			root = new TreeNode(insertValue); // create the root node here
		else
			root.insert(insertValue); // call the insert method
	} // end method insertNode
	// begin preorder traversal

	public void preorderTraversal()
{ 
      preorderHelper( root ); 
   } // end method preorderTraversal

	// recursive method to perform preorder traversal
	private void preorderHelper(TreeNode node) {
		if (node == null)
			return;
		System.out.printf("%d ", node.data); // output node data
		preorderHelper(node.leftNode); // traverse left subtree
		preorderHelper(node.rightNode); // traverse right subtree
	} // end method preorderHelper
	// begin inorder traversal

	public void inorderTraversal() {
		inorderHelper(root);
	} // end method inorderTraversal
	// recursive method to perform inorder traversal

	private void inorderHelper(TreeNode node) {
		// DIN KODE
		if(node == null)
			return;
		System.out.println(node.data);
		inorderHelper(node.leftNode);
		inorderHelper(node.rightNode);
	
		
	} // end method inorderHelper
	
		// begin postorder traversal
	public void postorderTraversal() {
		postorderHelper(root);
	} // end method postorderTraversal
	// recursive method to perform postorder traversal

	private void postorderHelper(TreeNode node) {
		// DIN KODE
		if(node == null)
			return;
		System.out.println(node.data);
		postorderHelper(node.leftNode);
		postorderHelper(node.rightNode);
	} // end method postorderHelper
	
	
	public void finMin(){
		if(root == null)
			return null;
		
		return finMin(root);
		
		
	}//end of finmin
	
	public void finMin(TreeNode node){
		
		if(node == null)
			return null;
		if(node.leftNode != null)
			return findMin(node.leftNode);
		
		return node.data;
		
	}//finMin treeNode node
	
} // end class Tree