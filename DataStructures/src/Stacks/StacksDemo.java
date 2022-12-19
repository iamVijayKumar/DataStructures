package Stacks;

public class StacksDemo {
	public static void main(String[] args) {
		ArrayStack stack=new ArrayStack(10);
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		
		stack.push(emp1);
		stack.push(emp2);
		stack.push(emp3);
		stack.push(emp4);
		stack.printStack();
		stack.pop();
		stack.printStack();
		System.out.println(stack.peek());
		stack.pop();
		stack.printStack();
		
		
	}
}
