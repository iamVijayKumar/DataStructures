package DoublyLinkedList;

public class DoublyLinked {
	public static void main(String[] args) {
		System.out.println("hi");
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		
		EmployeeDoublyLinkedList empdoublelist=new EmployeeDoublyLinkedList();
		empdoublelist.addtoFront(emp1);
		empdoublelist.addtoFront(emp2);
		empdoublelist.addtoFront(emp3);
		empdoublelist.addtoFront(emp4);;
		empdoublelist.printAll();
		System.out.println(empdoublelist.getSize());
		System.out.println("-----------------------------------------------");
		Employee emp5=new Employee("Surya","Kumar",32);
		empdoublelist.addtoEnd(emp5);
		empdoublelist.printAll();
		System.out.println(empdoublelist.getSize());
		System.out.println("-----------------------------------------------");
		Employee emp6=new Employee("Surya","yadav",36);
		empdoublelist.addBefore(emp6, emp5);
		empdoublelist.printAll();
		System.out.println(empdoublelist.getSize());
		System.out.println("-----------------------------------------------");
	

		System.out.println(empdoublelist.removeFromFront());
		empdoublelist.printAll();
		System.out.println(empdoublelist.getSize());
		System.out.println("-----------------------------------------------");
		System.out.println(empdoublelist.removeFromEnd());
		empdoublelist.printAll();
		System.out.println(empdoublelist.getSize());	
	}
}
