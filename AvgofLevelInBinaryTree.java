import java.util.LinkedList;
import java.util.Queue;

//import avgBinarytree.Node;

public class AvgofLevelInBinaryTree {
	Node root;
	static class Node
	{
		int data;
		Node left;
		Node right;
	}
	static Node newnode (int d)
	{
		Node temp = new Node();
		//System.out.println(d);
		temp.data = d;
		temp.left = temp.right = null;
		return temp;
	}
	static void averageOfLevels(Node node)
	{
		Queue <Node> q = new LinkedList<Node>();
		q.add(node);
		int count =0, sum = 0;
		//System.out.println(node.data);
		//double average = 0.0;
		while (!q.isEmpty())
		{
			count =0; 
			sum = 0;
			Queue <Node> temp =  new LinkedList<Node>();
			boolean isempty = q.isEmpty();
			//System.out.println(isempty);
			while (!q.isEmpty())
			{
				
				Node n = q.peek();
				//System.out.println(n.data);
				sum = sum + n.data;
				count++;
				q.remove();
				if (n.left != null)
				{
					temp.add(n.left);
				}
				if (n.right != null)
				{
					temp.add(n.right);
				}
			}
			q= temp;
			System.out.println(sum*1.0/count+ "");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//				 4
//				/\
//		       5  7
//		      /\  /
//		      3 6 1
//				 /
//				2
		Node root = null;
		root= newnode(4);
		root.left = newnode(5);
		root.left.right = newnode(6);
		root.left.left= newnode(3);
		root.right = newnode(7);
		root.right.left = newnode(1);
		root.right.left.left = newnode(2);
		//System.out.println("Averages of levels : "); 
	    //System.out.print("["); 
	    averageOfLevels(root); 
	   // System.out.println("]"); 
	}

}
