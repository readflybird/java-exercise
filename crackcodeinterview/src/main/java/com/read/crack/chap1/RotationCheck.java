package com.read.crack.chap1;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of 
 * another Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using 
 * only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)
 * 
 * @author read
 *
 */
public class RotationCheck {
	public static void main(String[] args) {
		test("waterbottle", "erbottlewat");
		test("water", "teraw");
	}
	
	private static void test(String s1, String s2) {
		boolean r = isRotation(s1, s2);
		System.out.println(s2 + (r ? " is " : " is not ") + "rotation of " + s1);
	}
	
	private static boolean isRotation(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		String s3 = s2+s2;

		if(StringUtils.isSubString(s1, s3)) {
			return true;
		} else {
			return false;
		}
	}
	
}
