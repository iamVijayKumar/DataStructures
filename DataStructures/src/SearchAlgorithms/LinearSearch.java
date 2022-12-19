package SearchAlgorithms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[]a= {2,5,9,8,2,8,7,10,4,3};
//		Scanner sc=new Scanner(System.in);
//		int key=sc.nextInt();
		linearSearch(a,2);
		linearSearch(a,77);
		linearSearch(a,21);
		linearSearch(a,8);
		
	}

	private static void linearSearch(int[] a, int key) {
		boolean res=false;
		int pos=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				res=true;
				pos=i;
				break;
			}
		}
		if(res) {
			System.out.println("Found at "+pos);
		}
		else {
			System.out.println("not found");
		}
	}
}
