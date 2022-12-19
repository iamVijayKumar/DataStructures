package Hashtables;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
	
	private LinkedList<StoredEmployee>[] hashTable;

	public ChainedHashTable() {
		hashTable=new LinkedList[10];
		for(int i=0;i<hashTable.length;i++) {
			hashTable[i]=new LinkedList<StoredEmployee>();
		}
	}
	
	public void put(String key,Employee value) {
		int hashedKey=hashKey(key);
		hashTable[hashedKey].add(new StoredEmployee(key, value));
	}
	
	public Employee get(String key) {
		int hashedKey=hashKey(key);
		Iterator<StoredEmployee> iter=hashTable[hashedKey].iterator();
		StoredEmployee employee=null;
		while(iter.hasNext()) {
			employee=iter.next();
			if(employee.key.equals(key)){
				return employee.employee;
			}
		}
		return null;
	}
	
	public Employee remove(String key) {
		int hashedKey=hashKey(key);
		Iterator<StoredEmployee> iter=hashTable[hashedKey].iterator();
		StoredEmployee employee=null;
		int index=-1;
		while(iter.hasNext()) {
			employee=iter.next();
			index++;
			if(employee.key.equals(key)){
				break;
			}
		}
		if(employee==null) {
			return null;
		}
		else {
			hashTable[hashedKey].remove(index);
			return employee.employee;
		}
	}


	private int hashKey(String key) {
		return key.length()%hashTable.length;
	}

	public void printHashTable() {
		for(int i=0;i<hashTable.length;i++) {
			if(hashTable[i].isEmpty()) {
				System.out.println("position "+i+" is empty");
			}
			else {
				Iterator<StoredEmployee> iter=hashTable[i].iterator();
				while(iter.hasNext()) {
					System.out.print(iter.next().employee);
					System.out.print("=>");
				}
				System.out.println();
			}
		}
		System.out.println("+++++++++++++++++");
	}
}
