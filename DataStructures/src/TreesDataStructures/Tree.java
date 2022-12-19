package TreesDataStructures;

public class Tree {
	
	private TreeNode root;
	public void insert(int value) {
		if(root==null) {
			root=new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	public void traverseInorder() {
		if(root!=null) {
			root.traverseInorder();
		}
	}
	public void traversePreOrder() {
		if(root!=null) {
			root.traversePreOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(root!=null) {
			return root.get(value);
		}
		return null;
	}
	public int min() {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		else {
			return root.min();
		}
	}
	public int max() {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		else {
			return root.max();
		}
	}
	
	public void delete(int value) {
		root=delete(root,value);
	}
	private TreeNode delete(TreeNode subTreeRoot, int value) {
		if(subTreeRoot==null) {
			return subTreeRoot;
		}
		if(value<subTreeRoot.getData()){
			subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(),value));
		}
		else if(value>subTreeRoot.getData()) {
			subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
		}
		else {
			//node has one or none children
			if(subTreeRoot.getLeftChild()==null) {
				return subTreeRoot.getRightChild();
			}
			else if(subTreeRoot.getRightChild()==null) {
				return subTreeRoot.getLeftChild();
			}
			//node has two children
			subTreeRoot.setData(subTreeRoot.getRightChild().min());
			subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
		}
		return subTreeRoot;
	}
}
