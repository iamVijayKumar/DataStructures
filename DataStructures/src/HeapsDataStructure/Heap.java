package HeapsDataStructure;

public class Heap {
	private int[] heap;
	private int size;

	public Heap(int capacity) {
		heap=new int[capacity];
	}
	
	public boolean isFull() {
		return size==heap.length;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int getParent(int index) {
		return (index-1)/2;
	}
	public int getChild(int index,boolean left) {
		return (2*index)+(left?1:2);
	}
	
	public void insert(int value) {
		if(isFull()) {
			throw new IndexOutOfBoundsException("Heap is Full");
		}
		heap[size]=value;
		fixHeapAbove(size);
		size++;
	}

	private void fixHeapAbove(int index) {
		int newValue=heap[index];
		while(index>0&&newValue>heap[getParent(index)]) {
			heap[index]=heap[getParent(index)];
			index=getParent(index);
		}
		heap[index]=newValue;
	}
	public int delete(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is Emmpty");
		}
		int parent=getParent(index);
		int deletedValue=heap[index];
		heap[index]=heap[size-1];
		
		if(index==0||heap[index]<heap[parent]) {
			fixHeapBelow(index, size-1);
		}
		else {
			fixHeapAbove(index);
		}
		size--;
		return deletedValue;
		
	}
	private void fixHeapBelow(int index,int heapLastIndex) {
		int childToSwap;
		while(index<=heapLastIndex) {
			int leftChild=getChild(index,true);
			int rightChild=getChild(index,false);
			if(leftChild<=heapLastIndex) {
				if(rightChild>heapLastIndex) {
					childToSwap=leftChild;
				}
				else {
					childToSwap= heap[leftChild]>heap[rightChild]?leftChild:rightChild;
				}
				if(heap[index]<heap[childToSwap]) {
					int tmp=heap[index];
					heap[index]=heap[childToSwap];
					heap[childToSwap]=tmp;
				}
				else {
					break;
				}
				index=childToSwap;
			}
			else {
				break;
			}
			
		}
	}
	public void sort() {
		int lastHeapedIndex=size-1;
		for(int i=0;i<lastHeapedIndex;i++) {
			int temp=heap[0];
			heap[0]=heap[lastHeapedIndex-i];
			heap[lastHeapedIndex-i]=temp;
			for(int j=0;j<heap.length;j++) {
				System.out.print(heap[j]+",");
			}
			System.out.print("After heap");
			fixHeapBelow(0,lastHeapedIndex-i-1);
			for(int j=0;j<heap.length;j++) {
				System.out.print(heap[j]+",");
			}
			System.out.println();
		}
	}
	public void printHeap() {
		for(int i=0;i<size;i++) {
			System.out.print(heap[i]+",");
		}
		System.out.println();
	}
	
	public void peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("heap is empty");
		}
		System.out.println(heap[0]);
	}
	
	
}
