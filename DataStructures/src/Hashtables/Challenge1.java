package Hashtables;

public class Challenge1 {
	public static void main(String[] args) {
		int[] nums=new int[10];
		int[] numsToAdd= {59832,43,6894,500,99,-58};
		for(int i=0;i<numsToAdd.length;i++) {
			nums[hash(numsToAdd[i])]=numsToAdd[i];
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}

	private static int hash(int value) {
		int hashedkey=Math.abs(value%10);
		return hashedkey;
	}
}
