package SinglyLinkedList;

public class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public void addtoFront(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(size==0) {
			return null;
		}
		EmployeeNode removednode=head;
		head=head.getNext();
		size--;
		return removednode;
	}
	
	
	public int getSize() {
		
		return size;
		
	}


	public void printAll() {
		EmployeeNode current=head;
		System.out.print("Head ->");
		while(current!=null) {
			System.out.println(current);
			System.out.print("->");
			current=current.getNext();
		}
		System.out.println("null");
		
	}


	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	
}
