package Assisted_Practice_Project_;

public class DoublyLinkedList {
	    	Node head; 
			
	    	class Node 
			{ 
			        int data; 
			        Node prev; 
			        Node next; 
			        Node(int d) 
			        { 
			        	data = d; 
			        } 
			 }

			// to insert new node
			public void push(int new_data) 
	    	{ 
					Node new_Node = new Node(new_data); 
					new_Node.next = head; 
					new_Node.prev = null; 
					if (head != null) 
							head.prev = new_Node; 
					head = new_Node; 
	    	} 
			
			//insert node after node
			public void InsertAfter(Node prev_Node, int new_data) 
			{ 
					if (prev_Node == null) 
					{ 
			         		System.out.println("The given previous node cannot be NULL "); 
			           		return; 
			        } 	
					Node new_node = new Node(new_data); 
					new_node.next = prev_Node.next; 
					prev_Node.next = new_node; 
					new_node.prev = prev_Node; 
					if (new_node.next != null) 
			            		new_node.next.prev = new_node; 
			   } 
			   
			//append 
			void append(int new_data) 
			{ 
					Node new_node = new Node(new_data); 
			  		Node last = head; 
			  		new_node.next = null;
			  		if (head == null) { 
			            	new_node.prev = null; 
			            	head = new_node; 
			            	return; 
			        	} 
			  		while (last.next != null) 
			           			last = last.next; 
					last.next = new_node; 
					new_node.prev = last; 
			    }
			
			
			// print list
			public void printlist(Node node) 
			{ 
			     		Node last = null; 
			       		System.out.println("\nTraversal in forward Direction"); 
			       		while (node != null) { 
			            			System.out.print(node.data + " "); 
			            			last = node; 
			            			node = node.next; 
			        		} 
			        		System.out.println(); 
			        		System.out.println("\nTraversal in reverse direction"); 
			        		while (last != null) 
			        		{ 
			            			System.out.print(last.data + " "); 
			            			last = last.prev; 
			        		} 
			  }
			
			
			public static void main(String[] args) 
	    	{
				DoublyLinkedList dll = new DoublyLinkedList();
				dll.append(9); 
				dll.push(4);
				dll.push(2); 
				dll.append(6); 
				dll.InsertAfter(dll.head.next, 8); 
				System.out.println("Created Doubly Linked List is: "); 
				dll.printlist(dll.head); 
	    	} 
	} 