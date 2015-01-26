package javaHome;

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string to check: ");
		original = in.nextLine();
		
		int length = original.length();
		
		for (int i = length-1; i >=0; i--)
			reverse = reverse+original.charAt(i);
		
		if (original.equals(reverse)) 
			System.out.println("string is a palindrome.");
		else
			System.out.println("string is not a palindrome.");
	}

}
