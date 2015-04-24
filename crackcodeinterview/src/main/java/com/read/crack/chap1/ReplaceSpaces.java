package com.read.crack.chap1;

/**
 * Write a method to replace all spaces in a string with ‘%20'
 * 
 * @author read
 *
 */
public class ReplaceSpaces {
	public static void main(String[] args) {
		test("The best website");
		test("Continuous  spaces  test ");
		test("Simple");
		test(null);
	}
	
	private static void test(String s) {
		String s1 = replaceSpaces(s);
		System.out.println("Original string="+s+", new string="+s1);
	}
	
	private static String replaceSpaces(String s) {
		if(s == null || s.isEmpty()) {
			return s;
		}
		char o = ' ';
		String n = "%20";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == o){
				sb.append(n);
			} else {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}
