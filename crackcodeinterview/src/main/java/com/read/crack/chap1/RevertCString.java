package com.read.crack.chap1;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as 
 * five characters, including the null character )
 * 
 * @author read
 *
 */
public class RevertCString {
	public static void main(String[] args) {
		char[] s1 = {'a','b', 'c', 'd', '\0'};
		test(s1);
		char[] s2 = {};
		test(s2);
		char[] s3 = null;
		test(s3);
		char[] s4 = {'\0'};
		test(s4);
	}
	
	private static void test(char[] s) {
		char[] reverse = reverse(s);
		if(s == null) {
			System.out.println("Original string:null, reversed string is:" + (s == null?"null":"not null"));
			return;
		}
		
		System.out.println("Original string: " + new String(s) + ".Reversed string:" + new String(reverse));
	}
	
	private static char[] reverse(char[] s) {
		if(s == null) {
			return null;
		}
		if(s.length < 1) {
			return s;
		}
		char[] ret = new char[s.length];
		for(int i = 0; i < s.length - 1; i++) {
			ret[i] = s[s.length - 2 - i];
		}
		ret[s.length - 1] = s[s.length - 1];
		
		return ret;
	}
}
