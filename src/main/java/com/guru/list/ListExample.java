package com.guru.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("guru", "Teja", "SRi" ,"SRi");
		System.out.println("input  "+names);
		/**
		 * normal approach before java 8
		 */
		List<String> upperCaseNames = new ArrayList<>();
		for (String n : names) {
			upperCaseNames.add(n.toUpperCase());
		}
		System.out.println("without java8  "+upperCaseNames);
		
		names.stream()
		     .map(x->x.toUpperCase())
		     .forEach(System.out::println);
		
		/***
		 * STREAMS OPERATIONS
		 */
		// foreach
		names.stream()
			 .map(x->x.toUpperCase())
	         .forEach(System.out::println);

		// count
		long count = names.stream().count();
		System.out.println("count is " + count);
		
		//distinct
		names.stream()
			 .distinct()
			 .forEach(System.out::println);
		
		//findFirst
		System.out.println("findFirst  -> " + names.stream().findFirst());
		
		//allMatch
		Predicate<String> getAllMatchPredicatefalse = x-> x.length()>3;
		System.out.println("allMatch with false ->" + names.stream().allMatch(getAllMatchPredicatefalse));

		Predicate<String> getAllMatchPredicatetrue= x-> x.length()>1;
		System.out.println("allMatch with true  ->" + names.stream().allMatch(getAllMatchPredicatetrue));
		
		//anyMatch
		System.out.println("anyMatch -> "+ names.stream().anyMatch(getAllMatchPredicatefalse));
		
		//findAny
		System.out.println("findAny -> "+ names.stream().findAny());
		
		//findFirst
	    System.out.println("findFirst -> "+ names.stream().findFirst());
	    
	    //filter
	    names.stream().filter(getAllMatchPredicatetrue).forEach(System.out::println);
	    
	    //limit
	    names.stream().limit(2).filter(getAllMatchPredicatetrue).forEach(System.out::println);
		//spliterator
		//System.out.println("spliterator  -> " + names.stream().spliterator().DISTINCT);
	    
	    
	    System.out.println("intput list -> "+names);
		System.out.println("modifing the list 'doing append operation'  ");
		
		List<String> updatedlist = names.stream()
		    .map(x->x+" updated")
		    .collect(Collectors.toList());
		System.out.println("updatedlist  -> "+ updatedlist);;
		
		
		
		// Create an Immutable List 
        List<String> lt 
            = Stream 
                  .of("Honey", "For", "MONEY") 
                  .collect(Collectors 
                               .collectingAndThen( 
                                   Collectors.toList(), 
                                   Collections::<String> unmodifiableList)); 
        System.out.println(lt);
        Function<String, String> mapper = x-> x+" hi  ->";
		lt.stream()
          .map(mapper)
          .map(x -> x + "  tryied to update")
          .forEach(System.out::print);
	}

}
