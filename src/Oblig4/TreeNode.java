package Oblig4;

class TreeNode {
	// package access members
	TreeNode leftNode; // left node
	int data; // node value
	TreeNode rightNode; // right node
	// constructor initializes data and makes this a leaf node

	public TreeNode(int nodeData) {
		data = nodeData;
		leftNode = rightNode = null; // node has no children
	} // end TreeNode constructor
	// locate insertion point and insert new node; ignore duplicate values

	public void insert(int insertValue) {
		// insert in left subtree
		if (insertValue < data) {
			// insert new TreeNode
			if (leftNode == null)
				leftNode = new TreeNode(insertValue);
			else
				// continue traversing left subtree
				leftNode.insert(insertValue);
		} // end if
		else if (insertValue > data) // insert in right subtree
		{
			// insert new TreeNode
			if (rightNode == null)
				rightNode = new TreeNode(insertValue);
			else
				// continue traversing right subtree
				rightNode.insert(insertValue);
		} // end else if
	} // end method insert
} // end class TreeNode