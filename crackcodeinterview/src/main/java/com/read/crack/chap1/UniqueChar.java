package com.read.crack.chap1;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you 
 * can not use additional data structures?
 * 
 * @author read
 *
 */
public class UniqueChar {
	public static void main(String[] args) {
		test("A simple string for test");
		test("simple");
		test("");
		test(null);
	}
	
	private static void test(String s) {
		boolean r = isUniqueChar(s);
		System.out.println((r ? " All " : " Not all ") +" characters are unique in string: " + s);
	}
	
	private static boolean isUniqueChar(String s) {
		if(s == null || s.isEmpty()) {
			return true;
		}
		boolean[] arr = new boolean[255];
		for(int i = 0; i < 255; i++) {
			arr[i] = false;
		}
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int pos = (int)c;
			if(arr[pos]) {
				return false;
			} else {
				arr[pos] = true;
			}
		}
		return true;
	}
}
