package HeapsDataStructure;

public class HeapsDemo {
	public static void main(String[] args) {
		Heap heap= new Heap(10);
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		heap.printHeap();
//		
//		System.out.println(heap.delete(1));
//		heap.printHeap();
		heap.peek();
		heap.sort();
		heap.printHeap();
	}
}
