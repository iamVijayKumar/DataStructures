package Hashtables;

public class ArrayImplementationDemo {
	public static void main(String[] args) {
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		
//		SimpleHashTable hashTable=new SimpleHashTable();
		ChainedHashTable hashTable=new ChainedHashTable();
		hashTable.put("Vijay", emp1);
		hashTable.put("Virat", emp2);
		hashTable.put("Rohit", emp3);
		hashTable.put("MS", emp4);
		hashTable.printHashTable();
		System.out.println(hashTable.get("Virat"));
		System.out.println("===============");
		System.out.println(hashTable.remove("Virat"));
		
		hashTable.printHashTable();
		System.out.println(hashTable.get("Vijay"));
	}
}
