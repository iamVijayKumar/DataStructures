package Hashtables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashTablebyJDK {
	public static void main(String[] args) {
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		
		HashMap<String, Employee> hashMap=new HashMap<String,Employee>();
		hashMap.put(emp1.getFirstName(), emp1);
		hashMap.put("Virat", emp2);
		hashMap.put("Rohit", emp3);
		
		//hashMap.put("Vijay", emp4);
		Iterator<Employee> iter=hashMap.values().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(hashMap.containsKey("Rohit"));
		System.out.println(hashMap.containsValue(emp4));
		System.out.println(hashMap.get("Virat"));
		System.out.println(hashMap.getOrDefault("Dhoni", emp4));
		System.out.println(hashMap.remove("Vijay"));
		
		System.out.println(hashMap.values());
	}
}
