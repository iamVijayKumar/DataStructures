package SearchAlgorithms;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[]a= {2,5,19,8,12,18,7,10,4,3};
		Arrays.sort(a);
		for(int x:a) {
			System.out.print(x);
			System.out.print("=>");	
		}
		
		System.out.println("\n--------------------------");
		binarySearch(a,2);
		binarySearch(a,22);
		binarySearch(a,23);
		binarySearch(a,12);
		System.out.println(recursiveBinarySearch(a,5));
		System.out.println(recursiveBinarySearch(a,2));
		System.out.println(recursiveBinarySearch(a,22));
		System.out.println(recursiveBinarySearch(a,23));
		System.out.println(recursiveBinarySearch(a,12));

	}



	private static void binarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int start=0;
		int end=a.length;
		boolean res=false;
		System.out.println("Finding "+key);
		while(start<end) {
			int mid=(start+end)/2;
			System.out.print(" Mid point:"+mid);
			System.out.println(" Value "+a[mid]);
			if(a[mid]==key) {
				System.out.println("Found at"+mid);
				System.out.println("--------------------------");
				res=true;
				break;
			}
			else if(a[mid]<key){
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		if(!res) {
			System.out.println("Not Found");
			System.out.println("--------------------------");
		}
	}
	
	
	private static int recursiveBinarySearch(int[] a, int value) {
		System.out.println("--------------------------");
		System.out.println("Finding "+value);
			return recursiveBinarySearch(a,0,a.length, value);	
	}



	private static int recursiveBinarySearch(int[] a, int start, int end, int value) {
		if(start>=end) {
			System.out.println("not found");
			return -1;
		}
		int mid=(start+end)/2;
		
		System.out.println("Mid point:"+mid+" Value:"+a[mid]);
		if(a[mid]==value) {
			System.out.println("Found at"+mid);
			return mid;
		}
		else if(a[mid]<value){
			return recursiveBinarySearch(a, mid+1, end, value);
		}
		else {
			return recursiveBinarySearch(a, start, mid, value);
		}
	}

}
