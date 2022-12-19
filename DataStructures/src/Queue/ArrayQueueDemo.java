package Queue;

public class ArrayQueueDemo {
	public static void main(String[] args) {
		Employee emp1=new Employee("Vijay", "Kumar", 95);
		Employee emp2=new Employee("Virat", "Kohli", 18);
		Employee emp3=new Employee("Rohit", "Sharma", 45);
		Employee emp4=new Employee("Ms", "Dhoni", 7);
		
		ArrayQueue queue=new ArrayQueue(4);
		queue.add(emp1);
		queue.add(emp2);
		queue.add(emp3);
		queue.add(emp4);
		Employee emp5=new Employee("Ms", "Dhoni", 7);
		queue.add(emp5);
//		queue.printQueue();
//		System.out.println(queue.remove());
//		queue.printQueue();
//		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
		queue.printQueue();
		
	}
}
