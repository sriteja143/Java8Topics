package com.guru.stream.task;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class GetCountBySpecificCondition {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3, 4,1,5,1,9,1);
		 /** count the no of 1s in list*/
		 System.out.println(getCountMatchingwith(list,1));
		 /** count the no of 4s in list*/
		 System.out.println(getCountMatchingwith(list,4));
		 
		 
		 /**average of list*/
		 System.out.println(getAverage(list));
	}

	private static OptionalDouble getAverage(List<Integer> list) {
		return list.stream().mapToInt(x->x).average();
	}

	private static long getCountMatchingwith(List<Integer> list, int i) {
		return list.stream()
				.filter(x->x==i)
				.count();
	}

}
