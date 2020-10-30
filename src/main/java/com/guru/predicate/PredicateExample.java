package com.guru.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		System.out.println("Welcome to PREDICATE example");
		
		Predicate<Integer> greaterThan2 = x -> x>2;
		int num1 = 10;
		System.out.println(num1 + " is greater than 2  :: "+ greaterThan2.test(num1));
		
		// predicate exaple for array
		Integer[] intarr = new Integer[] {1,10,20,4,1,1,30,100};
		List<Integer> list = new ArrayList<>();
		for (int i : intarr) {
			list.add(i);
		}
		
		
		/**
		 * predcate using list
		 * */
		List<Integer> list1 = new ArrayList<>(); 
        Collections.addAll(list1, intarr);
        	
        	   list1
		      .stream()
		      .filter(greaterThan2)
		      .forEach(System.out::println);
		      
	}
	
	
}
