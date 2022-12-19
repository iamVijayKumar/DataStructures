package Hashtables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSortDemo {
	public static void main(String[] args) {
		int[] a= {54,46,83,66,95,92,43};
		bucketSort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	private static void bucketSort(int[] a) {
		List<Integer>[] buckets=new List[10];
		for(int i=0;i<buckets.length;i++) {
			buckets[i]= new ArrayList<Integer>();
		}
		
		for(int i=0;i<a.length;i++) {
			buckets[hash(a[i])].add(a[i]);
		}
		for(List bucket:buckets) {
			Collections.sort(bucket);
		}
		int j=0;
		for(int i=0;i<buckets.length;i++) {
			for(int value:buckets[i]) {
				a[j++]=value;
			}
		}
	}
	private static int hash(int value) {
		return value/(int)10;
	}
}
