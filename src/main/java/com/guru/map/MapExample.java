package com.guru.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
/**
 * 
 * @author Guru teja
 *
 * This class contains mainly Stream operations on Map
 */
public class MapExample {
	public static int init = 1;
	public static Map map = new HashMap<>();

	public static void main(String[] args) {

		String[] arr = new String[] { "guru", "teja", "reddy", "sri" };
		for (String name : arr) {
			map.put(map.size() + 1, name);
		}

		// printing map 
		System.out.println("printing map in ascending order");
		map.entrySet()
		   .stream()
		   .forEach(System.out::println);
		
		
		// map in asending order by values
		System.out.println("map in ascending order by values");
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue()) // asending order by value
		.forEach(System.out::println);
		
	
		// map in asending order by keys
		System.out.println("map in ascending order by keys");
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())// asending order by key
		.forEach(System.out::println);
		
		
		System.out.println("printing map in dcending order");
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey().reversed())// dcending order by key
		.forEach(System.out::println);

		System.out.println("printing map in dcending order by value");
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue().reversed())// dcending order by value
		.forEach(System.out::println);
		
		
		/**
		 * sorting the values by map value length
		 */
		System.out.println("sorting the values by map value length");
		map
		.entrySet()
		.stream()
		//.filter(x -> "something".equals(x.getValue())) // static map not applicable
		.forEach(System.out::println);
		
		Map<Integer,String> newmap = map;
		System.out.println("new map ");
		newmap.entrySet()
		.stream()
		.filter(x ->x.getValue().length()>3)
		.forEach(System.out::println);
	
	
		System.out.println("::::::::::::: Sorting based on predicate ::::::::::::");
		Predicate<? super Entry<Integer, String>> greterthan3 = i->i.getValue().length()>3;
		Map<Integer,String> newmap1 = map;
		System.out.println("new map1 ");
		newmap1.entrySet()
		.stream()
		.filter(greterthan3)
		.forEach(System.out::println);
		
	}

}
