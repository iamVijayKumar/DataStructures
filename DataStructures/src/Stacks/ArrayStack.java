package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
	private Employee[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		stack=new Employee[capacity];
	}
	public void push(Employee emp1) {
		if(top==stack.length) {
			//resize
			Employee[] newArray=new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack=newArray;
		}
		stack[top++]=emp1;
	}
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee emp=stack[--top];
		stack[top]=null;
		return emp;
	}
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	public void printStack() {
		for(int i= top-1 ; i>0 ;i--) {
			System.out.println(stack[i]);
		}
		System.out.println("-------------------------------------");
	}
	
}
