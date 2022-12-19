package ListsDataStructures;

import java.util.Iterator;
import java.util.LinkedList;

import DoublyLinkedList.Employee;

public class LinkedListbyJDK {
	public static void main(String[] args) {
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		LinkedList<Employee> emp=new LinkedList<>();
		emp.addFirst(emp4);
		emp.addLast(emp3);
		emp.addLast(emp2);
		emp.addFirst(emp1);
		printAll(emp);
//		for(Employee x:emp) {
//			System.out.println(x);
//		}
		Employee emp5=new Employee("Surya", "Kumar",33);
		emp.add(emp5);
		printAll(emp);
		emp.removeFirst();
		printAll(emp);
		emp.remove();
		printAll(emp);
		emp.removeLast();
		printAll(emp);
		System.out.println(emp.contains(emp5));
	}
	public static void printAll(LinkedList<Employee> emp) {
		Iterator iter=emp.listIterator();
		System.out.print("Head ->");
		while(iter.hasNext()) {
			System.out.println(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
		System.out.println(emp.size());
		System.out.println("------------------------------------------------");
		
		
	}
}
