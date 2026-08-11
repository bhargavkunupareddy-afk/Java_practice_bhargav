
public class LinkedlistDemo {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	static Node head = null;
	static int size ;  // size of the linked list
	
	static void add(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		else {
			Node current = head;  // fetch the head node of the LL.
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			size++;
		}
	}
	
	static void remove() {
		
		if(head == null) {
			System.out.println("List is empty");
		}
		
		if(head.next == null) {
			System.out.println("one element is removed");
			head = null;
			size--;
			return;
		}
		
		Node current = head;  // fetch the head node of the LL.
		
		while(current.next.next != null) {
			current = current.next;
		}
		System.out.println(current.next.next + " got removed");
		current.next = null;
		size--;
		
	}
	
	static void display() {
		
		if(head == null) {
			System.out.println("List is empty");
		}
		
		Node current = head;  // fetch the head node of the LL.
		while(current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
	}
  	static void reverse() {
   System.out.println("");
 
    Node prev = null;
    Node current = head;
  
    while (current != null) {
       Node next = current.next;   // save next node
        current.next = prev;   // reverse link
        prev = current;        // move prev forward
        current = next;        // move current forward
    }

    head = prev; // new head
}
	
	public static void main(String[] args) {
		
       add(34);
       add(45);
       add(89);       
       display();        
       remove();
       display();
       reverse();
       display();
       
	}
}
 
 
