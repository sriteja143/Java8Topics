package com.guru.stream.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class ResultReplace3and5Multiples {

	/*
	 * Complete the 'fizzBuzz' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void fizzBuzz(int n) {
		Map<Integer, String> map = new HashMap();
		int i = 1;
		while (n >= i) {
			System.out.println("i value " + i);
			if (i == 0) {
				i++;
				continue;
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i % 3);
				map.putIfAbsent(i, "FizzBuzz");
			} else if (i % 3 == 0) {
				map.putIfAbsent(i, "Fizz");
			} else if (i % 5 == 0) {
				map.put(i, "Buzz");
			} else {
				map.putIfAbsent(i, i + "");
			}
			i++;
		}
		//map.entrySet().stream().forEach(System.out::println);
		map.entrySet().stream().map(x -> x.getValue()).forEach(System.out::println);
	}

}

public class Replace3and5Multiples {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		ResultReplace3and5Multiples.fizzBuzz(n);

		bufferedReader.close();
	}
}
