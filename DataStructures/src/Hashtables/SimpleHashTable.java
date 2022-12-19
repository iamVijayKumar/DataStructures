package Hashtables;

public class SimpleHashTable {
	private StoredEmployee[] hashTable;

	public SimpleHashTable() {
		hashTable=new StoredEmployee[10];
	}
	
	public void put(String key, Employee value) {
		int hashedKey=hashKey(key);
		if(occupied(hashedKey)) {
			int stopIndex=hashedKey;
			if(hashedKey==hashTable.length-1) {
				hashedKey=0;
			}
			else {
				hashedKey++;
			}
			while(occupied(hashedKey)&&
					hashedKey!=stopIndex &&
					hashedKey!=stopIndex) {
				hashedKey=(hashedKey+1)%hashTable.length;
			}
		}
		
		if(occupied(hashedKey)) {
			System.out.println("Already exists"+hashedKey);
		}
		else {
			hashTable[hashedKey]=new StoredEmployee(key, value);
		}
	}
	public Employee get(String key) {
		int hashedKey=findKey(key);
		return hashTable[hashedKey].employee;
	}
	private int findKey(String key) {
		int hashedKey=hashKey(key);
		if(hashTable[hashedKey]!=null&&
				hashTable[hashedKey].key.equals(key)) {
			return hashedKey;			
		}
		int stopIndex = hashedKey;
		if (hashedKey == hashTable.length-1) {
			hashedKey = 0;
		} 
		else {
			hashedKey++;
		}
		while (hashedKey != stopIndex && 
				hashTable[hashedKey]!=null &&
				!hashTable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashTable.length;
		}
		if(hashTable[hashedKey]!=null &&
				hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		}
		else {
			return -1;
		}
	}
	
	private int hashKey(String key) {
		return key.length()%hashTable.length;
	}

	public Employee remove(String key) {
		int hashedKey=findKey(key);
		if(hashedKey==-1) {
			return null;
		}
		Employee employee=hashTable[hashedKey].employee;
		
		StoredEmployee[] oldHashTable=hashTable;
		hashTable=new StoredEmployee[oldHashTable.length];
		for(int i=0;i<oldHashTable.length;i++) {
			if(oldHashTable[i]!=null) {
				put(oldHashTable[i].key, oldHashTable[i].employee);
			}
		}
		hashTable[hashedKey]=null;
		return employee;
	}
	public void printHashTable() {
		System.out.println("===================");
		for(int i=0;i<hashTable.length;i++) {
			if(hashTable[i]==null) {
				System.out.println("Empty");
			}
			else {
				System.out.println("position"+i+":"+hashTable[i].employee);
			}
			
		}

		System.out.println("===================");
	}
	private boolean occupied(int index) {
		return hashTable[index] != null;
	}
}
