package com.guru.stream.task;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSubstring' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String findSubstring(String s, int k) {
    // Write your code here
         int length = s.length();
         
        int i =1;
        List<String> list = new ArrayList<>();
        while(length >= i){
            list.add(s.charAt(i-1)+"");
            i++;
        }
     String vowelcount="";
       for (String string : list) {
           if("aeiou".contains(string)){
              vowelcount = vowelcount+string; 
//              System.out.println(vowelcount);
           }
       }
    if(vowelcount.isEmpty()){
    	 System.out.println("Not found!");
    	    return "Not found!";
    }
    System.out.println(vowelcount.substring(0,k));
    return vowelcount.substring(0,k);
    }

}

public class Vowelcount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.findSubstring(s, k);
        bufferedReader.close();
    }
}
