package assign4_4;

//4. Display Singly linear linked list in reverse order.

public class list {
	public static class Node{
		private Node next;
		private int data;

		
		public Node(int value)
		{
			data = value;
			next = null;
		}
		
	}
	public static Node data;
	private Node head;
	
	public list()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node newNode = new Node(value);
		
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void display()
	{
		
		Node trav = head;
		System.out.println("LIST : ");
		
		while(trav != null)
		{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
	}
	
	public void displayReverse()
	{
		System.out.println("REVERSE : ");

		rDisplay(head);
		System.out.println();

	}
	
	
	public void rDisplay(Node trav)
	{
		
		if(trav == null) {
			return;
		}
		rDisplay(trav.next);
		System.out.print(" "+trav.data);
		
	}
	
}
