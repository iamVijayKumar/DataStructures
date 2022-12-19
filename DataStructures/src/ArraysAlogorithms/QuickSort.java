package ArraysAlogorithms;

public class QuickSort {
	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22,-100};
		quick(a,0,a.length);
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void quick(int[] a,int start,int end) {
		if(end-start<2) {
			return ;
		}
		int pivotIndex=partition(a,start,end);
		quick(a,start,pivotIndex);
		quick(a,pivotIndex+1,end);
		
	}


	private static int partition(int[] a, int start, int end) {
		int pivot=a[start];
		int i=start;
		int j=end;
		while(i<j) {
			while(i<j&& a[--j]>=pivot);
				if(i<j) {
					a[i]=a[j];
				}
			while(i<j&& a[i++]<=pivot);
				if(i<j) {
					a[j]=a[i];
				}
		}
		a[j]=pivot;
		return j;
	}

}
