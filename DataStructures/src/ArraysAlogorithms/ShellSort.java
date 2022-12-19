package ArraysAlogorithms;

public class ShellSort {
	public static void main(String[] args) {
		int[]a= {20,35,-15,7,55,1,-22};
		for(int gap=a.length/2;gap>0;gap/=2) {
			for(int i=gap;i<a.length;i++) {
				int temp=a[i];
				int j=i;
				while(j>=gap&&a[j-gap]>temp) {
					a[j]=a[j-gap];
					j-=gap;
				}
				a[j]=temp;
			}
		}
		System.out.print("\n Elements are ");
		for(int i=0;i<a.length ;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
