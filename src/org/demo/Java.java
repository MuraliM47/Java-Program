package org.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Java {
	public static void main(String[] args) {
		String s="automation";
		
		Set<Character> s1=new LinkedHashSet<>();
		
		for (char ch: s.toCharArray()) {
			s1.add(ch);
		}
		System.out.println("Remove Duplicate String");
		System.out.println(" Duplicate String");
		
		System.out.println(s1);
		System.out.println("duplicate suceed");
}}
