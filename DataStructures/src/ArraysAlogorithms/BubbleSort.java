package ArraysAlogorithms;

import java.util.Scanner;

public class BubbleSort {
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
		
		/*
		 int j=0;
		while(j<n) {
			for(int i=0;i<n-1;i++) {
				
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			j++;
		}
		*/
		for(int unsortedindex=a.length-1;unsortedindex>0;unsortedindex--) {
			for(int i=0;i<unsortedindex;i++) {
				if(a[i]>a[i+1]) {
					swap(a,i,i+1);
				}
			}
		}
		System.out.print("\n Elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void swap(int[] a,int i,int j) {
		if(i==j) {
			return;
		}
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
