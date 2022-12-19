package Hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Challenge2 {
	public static void main(String[] args) {
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		LinkedList<Employee> empList=new LinkedList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp1);
		empList.add(emp2);
//		Iterator<Employee>iter=empList.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		empList.forEach(e->System.out.println(e));
		System.out.println("__________________________");
		
		//using List
		
		HashMap<Integer, Employee> empTable = new HashMap<>();
		ListIterator<Employee> iter = empList.listIterator();
		List<Employee> remove = new ArrayList<>();
		while (iter.hasNext()) {
			Employee emp = iter.next();
			if (empTable.containsKey(emp.getId())) {
				remove.add(emp);
			} else {
				empTable.put(emp.getId(), emp);
			}
		}
		for (Employee e : remove) {
			empList.remove(e);
		}
		empList.forEach(e->System.out.println(e));
		System.out.println("==================");
		 //using only HahsMap
		HashMap<Integer, Employee> empTable2 = new HashMap<>();
		ListIterator<Employee> iter2 = empList.listIterator();
		while (iter2.hasNext()) {
			Employee emp = iter2.next();
			if (!empTable2.containsKey(emp.getId())) {
				empTable2.put(emp.getId(), emp);
			}
		}
		for (Employee e : empTable2.values()) {
			System.out.println(e);
		}
	

	}
}
