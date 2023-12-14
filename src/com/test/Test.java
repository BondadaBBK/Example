package com.test;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Bharath Kumar Bondada Hi Bharath";
		String[] spl = name.split(" ");
		
		final Set<String> result = new HashSet<String>();
		final Set<String> temp = new HashSet<String>();
		for(String nam : spl) {
			
			if(!result.add(nam)) {
				temp.add(nam);
			}
			
		}
		System.out.println("list"+result);
		System.out.println("temp"+temp);
		

	}

}
