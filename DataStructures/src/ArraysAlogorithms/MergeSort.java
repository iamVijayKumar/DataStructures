package ArraysAlogorithms;

public class MergeSort {

	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22,-100};
		merge(a,0,a.length);
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void merge(int[] a,int start,int end) {
		if(end-start<2) {
			return;
		}
		int mid=(start+end)/2;
		merge(a,start,mid);
		merge(a,mid,end);
		mergesort(a,start,mid,end);
	}


	private static void mergesort(int[] a, int start, int mid, int end) {
		if(a[mid-1]<=a[mid]) {
			//for d.o < replace by>
			return;
		}
		int i=start;
		int j=mid;
		int tempIndex=0;
		 int[] temp = new int[end - start];
	        while (i < mid && j < end) {
	            temp[tempIndex++] = a[i] <= a[j] ? a[i++] : a[j++];
	          //for d.o < replace by >
	        }

	        System.arraycopy(a, i, a, start + tempIndex, mid - i);
	        System.arraycopy(temp, 0, a, start, tempIndex);

	}
}

