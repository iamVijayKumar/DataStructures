package ArraysAlogorithms;

import java.util.Scanner;

public class ArraysDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter elements of the array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
