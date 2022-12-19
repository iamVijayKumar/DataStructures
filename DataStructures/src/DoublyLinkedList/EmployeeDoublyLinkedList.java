package DoublyLinkedList;

public class EmployeeDoublyLinkedList {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addtoFront(Employee employee) {
		EmployeeNode node= new EmployeeNode(employee);
		
		if(head==null) {
			tail=node;
		}
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head=node;
		size++;
	}
	
	public void addtoEnd(Employee employee) {
		EmployeeNode node=new EmployeeNode(employee);
		
		if(tail==null) {
			head=node;
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail=node;
		size++;
	}
	
	public boolean addBefore(Employee newEmp,Employee ExistingEmp) {
		if(head==null) {
			return false;
		}
		//find exist employee
		EmployeeNode current=head;
		while(current!=null&& current.getEmployee()==ExistingEmp) {
			current=current.getNext();			
		}
		if(current==null) {
			return false;
		}
		EmployeeNode newNode= new EmployeeNode(newEmp);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);
		if(head==current) {
			head=newNode;
		}
		else {
			newNode.getPrevious().setNext(newNode);
		}
	
		size++;
		return true;
	}
	
	public EmployeeNode removeFromFront() {
		if(size==0) {
			return null;
		}
		EmployeeNode removednode=head;
		
		if(head.getNext()==null) {
			tail=null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		head=head.getNext();
		size--;
		return removednode;
	}
	
	public EmployeeNode removeFromEnd() {
		if(size==0) {
			return null;
		}
		EmployeeNode removednode=tail;
		if(tail.getPrevious()==null) {
			head=null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		
		tail=tail.getPrevious();
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
			System.out.print("<=>");
			current=current.getNext();
		}
		System.out.println("null");
		
	}


	public boolean isEmpty() {
		return size==0;
	}
	
	
}
