package ArraysAlogorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22};
//		for(int unsortedIndex=1;unsortedIndex<a.length;unsortedIndex++) {
//			int temp=a[unsortedIndex];
//			int i;
//			for(i=unsortedIndex;i>0 && a[i-1]>temp;i--) {
//				a[i]=a[i-1];
//			}
//			a[i]=temp;
//		}
		//Challenge by using recusion
		insertionSort(a, a.length);
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void insertionSort(int[] a,int num) {
		if(num<2) {
			return;
		}
		insertionSort(a,num-1);
		int i;
		int newElement=a[num-1];
		for(i=num-1;i>0 && a[i-1]>newElement;i--) {
			a[i]=a[i-1];
		}
		a[i]=newElement;
		
		for(int j=0;j<a.length ;j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}
}
