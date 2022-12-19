package SinglyIntegerLinkedList;

public class SinglyIntegerLinkedList {
	public static void main(String[] args) {
		Integer a=1;
		Integer b=2;
		Integer c=3;
		IntegerLinkedList list=new IntegerLinkedList();
		list.insertSorted(c);
		list.insertSorted(a);
		list.insertSorted(b);
		list.insertSorted(0);
		
		list.printAll();
	}
}
