//implement stack using linked list

class Que1
{
    public static void main(String[]args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println("Topmost element : "+s.peek());
        s.pop();
        System.out.println("Topmost element : "+s.peek());
    }
}

class Stack
{
    LinkedList l;
    public Stack()
    {
        l = new LinkedList();
    }

    public void push(int data)
    {
        l.addFirst(data);
    }

    public void pop()
    {
        l.deleteFirst();
    }

    public int peek()
    {
        return l.getHeadData();
    }
}
class LinkedList 
{
    static class Node
    {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    private Node head;
   // private Node tail;

    public LinkedList()
    {
        head = null;
        //tail = null;
    }


    public int getHeadData()
    {
        return head.data;
    }



    public boolean isEmpty()
    {
        // return head== null && tail == null
        return head == null;
    }

    public void deleteAll()
    {
        head = null;
    }

    public void addFirst(int element)
    {
        // create a node 
        Node newnode = new Node(element);
        // if list is empty 
        if(head == null)
        {
            head = newnode;
            newnode.next = newnode.prev = newnode;
        }
        // if list is not empty
        else
        {
            // add first node into next of newnode 
            newnode.next = head;
            // add last node into previous of newnode 
            newnode.prev = head.prev;
            // add newnode into prev of next node 
            head.prev.next= newnode;
            // add newnode into next of last node 
            head.prev = newnode;
            // add newnode into head 
            head = newnode;
        }
    }

    public void addLast(int element)
    {
        // create a node 
        Node newnode = new Node(element);
        // if list is empty
        if(isEmpty())
        {
            head = newnode;
            newnode.next = newnode.prev = newnode;
        }
        // if list is not empty
        else
        {
            // add first node into next of newnode 
            newnode.next = head;
            // add last node into previous of newnode 
            newnode.prev = head.prev;
            // add newnode into next of last node 
            head.prev.next = newnode;
            // add newnode into prev of next node 
            head.prev = newnode;
        }
    }

    public void deleteFirst()
    {
        // if list is empty
        if(isEmpty())
            return;
        // if list have only one node
        else if(head == head.next)
            // make head a null 
            head = null;
        // if list has multiple nodes 
        else
        {
            // add seconde node into next of last node 
            head.prev.next = head.next;
            // add last node into previous of second node
            head.next.prev = head.prev;
            // add second node into head 
            head = head.next;
        }
    }

    public void deleteLast()
    {
        // if list is empty
        if(isEmpty())
            return;
        // if list have only one node 
        else if(head == head.next)
            head = null;
        // if list has multiple nodes
        else
        {
            // add first node into next of second last node 
            head.prev.prev.next = head;
            // add seconde last node into prev of first nide 
            head.prev = head.prev.prev;
        }
    }

    public void addPosition(int element,int pos)
    {
        if(pos < 1)
            return;
        // create a node
        Node newnode = new Node(element);
        // if list is empty
        if(isEmpty())
        {
            // add newnode into head 
            head = newnode;
            // make list circulat 
            newnode.next = newnode.prev = head;
        }
        else if(pos == 1)
            addFirst(element);
        // if list has multiple nodes
        else
        {
            Node trav = head;
            // traverse till pos-1 node
            for(int i =1 ;i<pos-1;i++)
            {
                trav = trav.next;
                if(trav == head && pos != 2)
                    return;
            }

            // add pos node into next of newnode 
            newnode.next = trav.next;
            // add pos-1 node into prev of newnode 
            newnode.prev = trav;
            // add newnode into prev of pos node 
            trav.next.prev = newnode;
            // add newnode into next of pos -1 node
            trav.next = newnode;
        }

    }

    public void deletePosition(int pos)
    {
        // if list is empty 
        if(head == null|| pos < 1)
            return;
        // if list has only one node
        if(head == head.next)
            // make head is null 
            head = null;
        else if(pos == 1)
            deleteFirst();
        else
        {
            // traverse till pos of node 
            Node trav = head;
            for(int i =1;i<pos;i++)
            {
                trav = trav.next;
                if(trav == head)
                    return;
            }
            // add pos+1 node into next of pos-1 node 
            trav.prev.next = trav.next;
            // add pos-1 node into prev of pos+1 node 
            trav.next.prev = trav.prev;
        }
    }
    public void forwardDisplay()
    {
        if(isEmpty())
            return;
        // create a trav and start at first node 
        Node trav = head;
        do
        {
            // print data of current node 
            System.out.print("  "+trav.data);
            // go to next node 
            trav = trav.next;
        }while(trav != head);  // repeat step 2 and 3 

        System.out.println("");
    }

    public void reverseDisplay()
    {
        if(isEmpty())
            return;
        // create a trav and start at last node 
        Node trav = head.prev;
        do
        {
            // print data of current node 
            System.out.print("  "+trav.data);
            // go to previous node 
            trav = trav.prev;
        }while(trav != head.prev);
        System.out.println(" ");
    }
}