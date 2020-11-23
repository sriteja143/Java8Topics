package com.guru.stream.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatedInList {

	public static void main(String[] args) {

		// 3, 4, 9
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

		Set<Integer> result = findDuplicateBySetAdd(list);
		result.forEach(System.out::println);

		Set<Integer> resultbyfrequency = findDuplicateByFrequency(list);
		resultbyfrequency.forEach(System.out::println);

	}

	/**
	 * <h2>finding duplicates using set , if element is not duplicated it will
	 * return true else false</h2>
	 * 
	 * @param <T>  here T is generic we can pass any object
	 * @param list
	 * @return
	 */
	public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

		Set<T> items = new HashSet<>();
		return list.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the
														// set.
				.collect(Collectors.toSet());

	}

	/**
	 * <h2>finding duplicates using Collections.frequency , if element is not
	 * duplicated it will return true else false</h2>
	 * 
	 * @param <T>  here T is generic we can pass any object
	 * @param list
	 * @see Collections.frequency
	 * @return
	 */
	public static <T> Set<T> findDuplicateByFrequency(List<T> list) {

		return list
				.stream()
				.filter(i -> Collections.frequency(list, i) > 1)
				.collect(Collectors.toSet());
	}

	/**
	 * <h2>finding duplicates using Collectors.groupingBy , if element is not
	 * duplicated it will return true else false</h2>
	 * @param <T>
	 * @param list
	 * @see Collectors.groupingBy
	 * @return
	 */
	public static <T> Set<T> findDuplicateByGrouping(List<T> list) {

		return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // create a map
																										// {1=1, 2=1,
																										// 3=2, 4=2,
																										// 5=1, 7=1,
																										// 9=2}
				.entrySet().stream() // Map -> Stream
				.filter(m -> m.getValue() > 1) // if map value > 1, duplicate element
				.map(Map.Entry::getKey).collect(Collectors.toSet());

	}
}