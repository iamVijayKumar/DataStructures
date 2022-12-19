package TreesDataStructures;

public class TreeDemo {
	
	public static void main(String[] args) {
		Tree intTree=new Tree();
		intTree.insert(25);
		intTree.insert(20);
		intTree.insert(15);
		
		intTree.insert(27);
		intTree.insert(30);
		intTree.insert(29);
		intTree.insert(26);
		intTree.insert(22);
		intTree.insert(32);
		intTree.insert(17);
		intTree.traverseInorder();
		System.out.println("=============");
		System.out.println(intTree.get(20));
		System.out.println(intTree.get(37));
		System.out.println(intTree.get(32));
		System.out.println(intTree.min());
		System.out.println(intTree.max());
		System.out.println("PreOrder Traversal");
		intTree.traversePreOrder();
		System.out.println("=============");
		intTree.delete(15);
		intTree.traverseInorder();
		System.out.println();
		intTree.delete(27);
		intTree.traverseInorder();
		
	}

}
