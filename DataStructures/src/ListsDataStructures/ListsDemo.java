package ListsDataStructures;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
	public static void main(String[] args) {
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee("Vijay", "Kumar", 95));
		emp.add(new Employee("Virat", "Kohli", 18));
		emp.add(new Employee("Rohit", "Sharma", 45));
		emp.add(new Employee("Mahendra", "Dhoni", 7));
		//print all employees
		emp.forEach(x -> System.out.println(x));
		// get employee by index
		System.out.println();
		System.out.println(emp.get(1));
		//check whether list is empty
		System.out.println();
		System.out.println(emp.isEmpty());
		//size of list
		System.out.println();
		System.out.println(emp.size());
		//modifying employee at an index
		emp.set(3,new Employee("MS","Dhoni", 7));
		//print all employees
		System.out.println();
		emp.forEach(x -> System.out.println(x));
		// add an employee at desired index
		emp.add(3,new Employee("Surya","Kumar",33));
		System.out.println();
		emp.forEach(x -> System.out.println(x));
		//to Array
		Employee[] empArray=emp.toArray(new Employee[emp.size()]);
		System.out.println();
		for(Employee x:empArray) {
			System.out.println(x);
		}
		// check contains the employee add equals method in employee class
		System.out.println(emp.contains(new Employee("MS","Dhoni",7)));
		//get index
		System.out.println(emp.indexOf(new Employee("Surya","Kumar",33)));
		emp.remove(3);
		emp.forEach(x -> System.out.println(x));
	}
}
