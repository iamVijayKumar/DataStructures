package ArraysAlogorithms;

public class CountingSort {
	public static void main(String[] args) {
		int[]a= {2,5,9,8,2,8,7,10,4,3};
		count(a,1,10);
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void count(int[] a,int min,int max) {
		int[]count=new int[(max-min)+1];
		for(int i=0;i<a.length;i++) {
			count[a[i]-min]++;
		}
		int j=0;
		for(int i=min;i<=max;i++) {
			while(count[i-min]>0){
				a[j++]=i;
				count[i-min]--;
			}
		}
		
	}


	
}
