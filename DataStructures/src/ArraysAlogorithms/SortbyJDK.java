package ArraysAlogorithms;

import java.util.Arrays;

public class SortbyJDK {
	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22,-100};
		Arrays.sort(a);
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
}
