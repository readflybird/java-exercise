package com.read.crack.chap1;

public class StringUtils {
	public static boolean isSubString(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() > s2.length()) {
			return false;
		}
		
		for (int j = 0; j < s2.length(); j++) {
			if (s2.charAt(j) == s1.charAt(0)) {
				int matchStart = j;
				int targetStart = 1;
				for (int k = matchStart+1; k < s2.length() && targetStart < s1.length(); k++) {
					if(s2.charAt(k) != s1.charAt(targetStart++)) {
						break;
					}
				}
				if(targetStart == s1.length()) {
					return true;
				}
			}
		}
		return false;
	}
}
