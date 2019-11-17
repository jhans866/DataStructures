
public class BinarySearchTree {
	Node rootnode;
	class Node {
		int data;
		Node left ;
		Node right;
			Node(int d)
			{
				data = d;
				left = right = null;
				
			}
		}
		BinarySearchTree()
		{
			rootnode = null;
		}
		public void insert(int d)
		{
			//System.out.println("Inside insert method");
			rootnode = insertInTree(rootnode, d);
			
		}
		public Node insertInTree(Node rootnode, int d)
		{
			//System.out.println("Inside insertInTree method");
			//Node tempnode = new Node();
			if(rootnode == null)
			{
				//System.out.println("setting root node");
				rootnode  = new Node(d);
				return rootnode;
			}
			else if(d < rootnode.data)
			{
				//System.out.println("setting left node");
				rootnode.left = insertInTree(rootnode.left, d);
			}
			else if (d>rootnode.data)
			{
				//System.out.println("setting right node");
				rootnode.right = insertInTree(rootnode.right, d);
			}
			//return newnode;
			return rootnode;
		}
		public void printInorder()
		{
			inorderTraversal(rootnode);
		}
	
		public void inorderTraversal(Node root)
		{
			if (root!=null)
			{
				inorderTraversal(root.left);
				System.out.println(" " + root.data + " ");
				inorderTraversal(root.right);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(40);
		bst.insert(50);
		bst.insert(20);
		bst.insert(80);
		bst.insert(90);
		bst.insert(100);
		bst.printInorder();
	}

}
