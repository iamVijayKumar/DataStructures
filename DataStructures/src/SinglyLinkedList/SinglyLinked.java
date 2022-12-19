package SinglyLinkedList;

public class SinglyLinked {
	public static void main(String[] args) {
		System.out.println("hi");
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		
		EmployeeLinkedList empLinked=new EmployeeLinkedList();
		System.out.println(empLinked.isEmpty());
		empLinked.addtoFront(emp1);
		empLinked.addtoFront(emp2);
		empLinked.addtoFront(emp3);
		
		empLinked.printAll();
		System.out.println(empLinked.getSize());
		
		
		System.out.println("Removed"+empLinked.removeFromFront());
		System.out.println(empLinked.getSize());
		empLinked.printAll();
	}
}
