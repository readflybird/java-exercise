package com.read.crack.chap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author read
 *
 */
public class RemoveDupNodes {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			list.add(i);
			list.add(i);
		}
		
		test1(list);
	}
	
	private static <E> void test(List<E> list) {
		System.out.println(list);
		removeDup(list);
		System.out.println(list);
	}
	
	private static <E extends Comparable<? super E>> void test1(List<E> list) {
		System.out.println(list);
		removeDup1(list);
		System.out.println(list);
	}
	
	private static <E> void removeDup(List<E> list) {
		if(list == null || list.size() < 1) {
			return;
		}
		Set<E> set = new HashSet<E>();
		for(int i = 0; i < list.size(); i++) {
			E e = list.get(i);
			if(set.contains(e)) {
				list.remove(i);
				i--;
			} else {
				set.add(e);
			}
		}
	}
	
	private static <E extends Comparable<? super E>> void removeDup1(List<E> list) {
		if(list == null || list.size() < 1) {
			return;
		}
		Collections.sort(list);
		E lastE = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i).equals(lastE)) {
				list.remove(i);
				i--;
			} else {
				lastE = list.get(i);
			}
		}
	}
}
