package Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueByJDKChallenge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(checkForPalindrome(str));
		
	}
	public static boolean checkForPalindrome(String str) {
		str=str.toLowerCase();
		LinkedList<Character> queue=new LinkedList<Character>();
		LinkedList<Character> stack=new LinkedList<Character>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a' && c<='z') {
				queue.addLast(c);
				stack.push(c);
			}
		}
		System.out.println(stack);
		System.out.println(queue);
		while(!stack.isEmpty()) {
			if(!stack.pop().equals(queue.removeFirst())) {
				return false;
			}
		}
		return true;
	}
}
