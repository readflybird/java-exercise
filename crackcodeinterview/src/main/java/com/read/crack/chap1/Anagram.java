package com.read.crack.chap1;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		test("torchwood","doctorwho");
		test("simple", "sim");
		test("sim", "simple");
		test("", null);
	}
	
	private static void test(String s1, String s2) {
		System.out.println("String:"+s1+(isAnagram(s1,s2)?" is ":" is not ") + " an anagram of string:" + s2);
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
		}
		
		for(int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			if(map.containsKey(c)) {
				if(map.get(c) == 1) {
					map.remove(c);
				} else {
					map.put(c, map.get(c) - 1);
				}
			} else {
				return false;
			}
		}
		
		return (map.keySet().size() ==0 ? true : false);
	}
}
