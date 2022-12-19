package TreesDataStructures;

import java.util.TreeMap;

import Hashtables.Employee;

public class TreesByJDk {
	public static void main(String[] args) {
		TreeMap<Integer, Employee> treeMap=new TreeMap<Integer,Employee>();
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		treeMap.put(1, emp1);
		treeMap.put(2, emp2);
		treeMap.put(4, emp4);
		treeMap.put(3, emp3);
		for(Employee e:treeMap.values()) {
			System.out.println(e);
		}
		System.out.println();
		treeMap.remove(4);
		for(Employee e:treeMap.values()) {
			System.out.println(e);
		}
	}
}
