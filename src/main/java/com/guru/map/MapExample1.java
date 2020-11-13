package com.guru.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * 
 * @author GuruTeja
 *
 *trying to give map example for Collections like [map,set,list]
 */
public class MapExample1 {
	public static Map<Integer,String> map = new HashMap<Integer,String>();
	
	public static void main(String[] args) {
		String str = "GURU,TEJA,REDDY,HONEY,CHINNU";
		String[] list= str.split("[,]");
		for (String string : list) {
			System.out.println(string);
			map.put( map.size() + 1, string);
		}
		
		Stream<Entry<Integer, String>> stream = map.entrySet().stream();
			 
		/** 
		 * count
		 */
		System.out.println("map size using stream : {}" +stream.count());
		
		/**
		 * print keyset
		 */
		System.out.println("print keyset ::::::::::::::");
		Function<? super Map.Entry<Integer,String>,? extends Integer> mapper = x->x.getKey();
		map.entrySet().stream()
		   .map(mapper)
		   .collect(Collectors.toList())
		   .forEach(System.out::println);
		
		/**
		 * print value
		 */
		System.out.println("print values ::::::::::::::");
		Function<? super Map.Entry<Integer,String>,? extends String> valuemapper = x->x.getValue();
		map.entrySet().stream()
		   .map(valuemapper)
		   .collect(Collectors.toList())
		   .forEach(System.out::println);;
		   
	}
}
