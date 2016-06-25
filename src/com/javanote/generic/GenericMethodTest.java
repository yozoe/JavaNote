package com.javanote.generic;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}
		
	public static void main(String[] args) {
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		fromArrayToCollection(oa, co);
		
		System.out.println(co);
		
		String[] sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		fromArrayToCollection(sa, cs);
		
		System.out.println(cs);
	}
	
}
