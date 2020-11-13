package com.guru.stream.task;

import java.util.Arrays;
import java.util.List;

public class SumOfListWithDifferentMethodsInStream {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1, 2, 3, 4);
	     System.out.println("Stream = " + list);

	    /** In this below process first we are converting 
	     *  Integer list to stream
	     *  then converted integer value to int
	     *  then called sum operation
	     */
	    getSumByDotIntValue(list);
	    
	    /** In this below process first we are converting 
	     *  Integer list to stream
	     *  then converted integer value to int by using objectReffernece
	     *  then called sum operation
	     */
	    getSumByObjectRefference(list);
	    
	    /** In this below process first we are converting 
	     *  Integer list to stream
	     *  then called sum operation
	     */
	    getSumByDirectSumInStream(list);
	    
	}

	private static int getSumByDirectSumInStream(List<Integer> list) {
		int count =list.stream()  
				   .mapToInt(x->x)
				   .sum();
		
		System.out.println("list total  " + count);
		return count;
	}

	private static int getSumByDotIntValue(List<Integer> list) {
		int total =  list.stream()
	         .mapToInt(x->x.intValue())
	         .sum();
		System.out.println("list of stream of integer count using getSumByDotIntValue : "+ total);
		return total;
	}
	
	private static int getSumByObjectRefference(List<Integer> list) {
		int total =  list.stream()
	         .mapToInt(Integer::intValue)
	         .sum();
		System.out.println("list of stream of integer count using getSumByObjectRefference : "+ total);
		return total;
	}

}
