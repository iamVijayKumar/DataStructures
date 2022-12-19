package Stacks;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class StackChallenge {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		checkForpalindrome(s);
		sc.close();
		
	}

	private static void checkForpalindrome(String s) {
		s=s.toLowerCase();
		String x= new String();
		LinkedList<Character> stack=new LinkedList<Character>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				stack.push(c);
				x+=c;
			}
		}
		String y="";
		ListIterator<Character> iter=stack.listIterator();
		while (iter.hasNext()) {
			y+=iter.next();
		}
		if(x.contentEquals(y)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palndrome");
		}
		
		
	}
}
