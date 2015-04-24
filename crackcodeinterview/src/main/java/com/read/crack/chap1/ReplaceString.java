package com.read.crack.chap1;

/**
 * A util method for string replacement
 * 
 * @author read
 *
 */
public class ReplaceString {
	public static void main(String[] args) {
		test("A test", " ", "%20");
		test("The cat is sleeping", "cat", "dog");
		test("And and then the story ends", "and", "then");
		test("cc me in the mail", "c","s");//continuous replacement
		test("aabcc", "abc", "b");//the string needs to be replaced for multiple times
		test("assddb","sd","");
		test(null, "check", "test");
	}
	
	private static void test(String s, String a, String b) {
		String s1 = replace(s, a, b);
		System.out.println("Original string=" + s + ", new string=" + s1);
	}
	
	public static String replace(String s, String a, String b) {
		if(s == null || s.isEmpty() || a == null || a.isEmpty() || b == null) {
			return s;
		}
		//Run replace once
		String s1 = replaceRun(s, a, b);
		
		if(s.equals(s1)) {
			//if no more replace happens we can return
			return s1;
		} else {
			//else we need to check if there are new strings need to be replaced
			return replace(s1, a, b);
		}
	}
	
	public static String replaceRun(String s, String a, String b){
		if(s == null || s.isEmpty() || a == null || a.isEmpty() || b == null) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
	
		for(int i = 0; i < s.length(); ){
			char c = s.charAt(i);
			if(c == a.charAt(0)) {
				boolean match = true;
				for(int j = 1; j < a.length(); j++) {
					if(i + j < s.length()) {
						if(s.charAt(i+j) != a.charAt(j)) {
							match = false;
							break;
						}
					} else {
						match = false;
						break;
					}
				}
				if(match) {
					sb.append(b);
					i += a.length();
				} else {
					sb.append(c);
					i++;
				}
			} else {
				sb.append(c);
				i++;
			}
		}
		
		return sb.toString();
	}
}
