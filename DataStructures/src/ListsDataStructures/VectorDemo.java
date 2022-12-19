package ListsDataStructures;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		List<Employee> emp=new Vector<>();
		emp.add(new Employee("Vijay", "Kumar", 95));
		emp.add(new Employee("Virat", "Kohli", 18));
		emp.add(new Employee("Rohit", "Sharma", 45));
		emp.add(new Employee("Mahendra", "Dhoni", 7));
		//print all employees
		emp.forEach(x -> System.out.println(x));
	}
}
