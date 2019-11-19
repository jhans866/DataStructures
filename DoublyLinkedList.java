
public class DoublyLinkedList {
	Node head;
	class Node {
		int data;
		Node previous;
		Node next;
		Node (int d)
		{
			data = d;
			previous = next =null;
		}
		
	}
	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}
	public DoublyLinkedList insertEnd(DoublyLinkedList list, int d)
	{
		Node newnode = new Node(d);
		if (list.head == null)
		{
			head = newnode;
			newnode.previous = null;
		}
		else
		{
			Node last = list.head;
			//newnode = list.head;
			
			while (last.next!=null)
			{
				last = last.next;
			}
			last.next = newnode;
			newnode.previous = last;
			System.out.println("data inserted in list "+ newnode.data);
		}
		return list;
	}
	public DoublyLinkedList insertBetween(DoublyLinkedList list, int d, int pos)
	{
		Node newnode = new Node(d);
		Node last = list.head;
		for (int i = 1; i<pos; i++)
		{
			last = last.next;
		}
		newnode.previous = last;
		newnode.next = last.next;
		last.next = newnode;
		return list;
	}
	public DoublyLinkedList deleteBetween(DoublyLinkedList list, int pos)
	{
		Node last = list.head;
		
		for (int i=1;i<pos;i++)
		{
			last = last.next;
		}
		/*Node nodetobedeleted = last;
		Node previousdode = last.previous;
		nodetobedeleted.next = nodetobedeleted.previous;
		previousdode.next = nodetobedeleted.next;*/
		last.next.previous = last.previous;
		last.previous.next = last.next;
		
		return list;
		
	}
	public void printList(DoublyLinkedList list)
	{
		Node node = list.head;
			while (node.next!=null)
			{
				System.out.println(node.data + " ");
				node = node.next;
			}
			if(node.next==null)
			{
				System.out.println(node.data + " ");
			}
			
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertEnd(dl, 10);
		dl.insertEnd(dl, 50);
		dl.insertEnd(dl, 30);
		dl.insertEnd(dl, 60);
		dl.insertEnd(dl, 20);
		dl.insertEnd(dl, 110);
		dl.insertEnd(dl, 100);
		dl.printList(dl);
		//System.out.println( "Insert in between");
		//dl.insertBetween(dl, 220, 3);
		//dl.printList(dl);
		System.out.println( "delete in between");
		dl.deleteBetween(dl, 3);
		dl.printList(dl);

	}

}
