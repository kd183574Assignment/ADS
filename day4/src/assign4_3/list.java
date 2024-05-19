package assign4_3;

//3. In singly linear list implement following operations. i. insert a new node after a given node ii. insert a
//new node before a given node

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
		private Node head;
		
		public list()
		{
			head = null;
		}
		public boolean isEmpty()
		{
			return head == null;
			
		}
		
		public void addFirst( int value)
		{
			Node newNode = new Node(value);
			
			newNode.next = head;
			head = newNode;
		}
		
		public void addLast(int value)
		{
			Node newNode = new Node(value);
			
			if(isEmpty())
			{
				head = newNode;
				
			}
			else
			{
				Node trav = head;
				while(trav.next != null)
					trav = trav.next;
				trav.next = newNode;
			}
		}
		
		public void display()
		{
			Node trav = head;
			System.out.println("LIST : ");
			
			while(trav != null)
			{
				System.out.println(" " + trav.data);
				
				trav = trav.next;
				
			}
			System.out.println(" ");
			
		}
		
	

}
