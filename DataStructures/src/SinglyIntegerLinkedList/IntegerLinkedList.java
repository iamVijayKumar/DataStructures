package SinglyIntegerLinkedList;

public class IntegerLinkedList {
	private IntegerNode head;
	private int size;
	
	public void addtoFront(Integer value) {
		IntegerNode node= new IntegerNode(value);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public IntegerNode removeFromFront() {
		if(size==0) {
			return null;
		}
		IntegerNode removednode=head;
		head=head.getNext();
		size--;
		return removednode;
	}
	
	
	public void insertSorted(Integer value) {
		if(head==null || head.getValue()>=value) {
			addtoFront(value);
			return;
		}
		IntegerNode current=head.getNext();
		IntegerNode previous=head;
		while(current!=null && current.getValue()<=value) {
			previous=current;
			current=current.getNext();
		}
		IntegerNode newNode=new IntegerNode(value);
		newNode.setNext(current);
		previous.setNext(newNode);
		size++;
	}
	
	public int getSize() {
		return size;
	}


	public void printAll() {
		IntegerNode current=head;
		System.out.print("Head ->");
		while(current!=null) {
			System.out.print(current);
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
