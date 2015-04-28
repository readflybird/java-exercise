package com.read.crack.chap1;

public class ReplaceAllTest {
	public static void main(String[] args) {
		test("aabcc", "abc", "b");
	}
	
	private static void test(String s, String a, String b) {
		String s1 = s.replaceAll(a, b);
		System.out.println("Original string=" + s + ", new string="+s1);
	}
}
