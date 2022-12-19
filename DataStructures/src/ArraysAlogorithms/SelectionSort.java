package ArraysAlogorithms;

public class SelectionSort {
	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22};
		for(int unsortedindex=a.length-1;unsortedindex>0;unsortedindex--) {
			int largest=0;
			for(int i=1;i<unsortedindex;i++) {
				if(a[i]>largest) {
					largest=i;
				}
			}
			swap(a, unsortedindex, largest);
		}
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
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
