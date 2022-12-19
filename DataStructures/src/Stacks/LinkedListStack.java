package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
		private LinkedList<Employee> stack;
		
		public LinkedListStack() {
			stack=new LinkedList<Employee>();
		}
		public void push(Employee emp) {
			stack.push(emp);
		}
		public Employee pop() {
			return stack.pop();
		}
		public Employee peek() {
			return stack.peek();
		}
		public boolean isEmpty() {
			return stack.isEmpty();
		}
		public void printStack() {
			ListIterator<Employee> iter=stack.listIterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			System.out.println("------------------");
		}
}
