import java.io.*; 
public class SinglyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
		}
		
	}
	public SinglyLinkedList insert(SinglyLinkedList list, int d)
	{
		Node newnode = new Node (d);
		newnode.next = null;
		if (list.head == null)
		{
			list.head = newnode;
		}
		else
		{
			Node last = list.head;
			while(last.next!= null)
			{
				last = last.next;
			}
			last.next = newnode;
		}
		return list;
	}
	public void printList(SinglyLinkedList list)
	{
		Node currNode = list.head;
		while(currNode!=null){
			System.out.println(currNode.data);
			currNode=currNode.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList s = new SinglyLinkedList();
		s.insert(s, 2);
		s.insert(s, 3);
		s.insert(s, 5);
		s.insert(s, 4);
		s.insert(s, 8);
		s.printList(s);

	}

}
