https://reactive.how/last

https://www.geeksforgeeks.org/java-8-predicate-with-examples/


https://www.journaldev.com/2774/java-8-stream


<h3> eclipse code review</h3>
https://www.codota.com/code/java/methods/java.util.stream.Collectors/collectingAndThen

<h1 style="color:blue"> Observed points </h1>
<h2 style="color:blue">Stream</h2>
<h3>MAP</h3>
A) map() operation is part of Stream API.</br>
B) map() is an Intermediate Operation.</br>
C) map() method takes as an argument Function functional interface and Function implementation will return the same as input or different type.</br>
D) map() returns a Stream&lt;T&gt;.</br>
E) map() method returned Stream preserves the order of how they appear in the original list or Stream.</br>
F) All values in the stream must be traversed through the logic of the Function function interface. (map() logic)</br>
G) This will be returning a value which is mandatory. If not returning will result in a compile-time error.</br>
H) map() method will always transform the current value or object into another type or same type. If we do not want to pass the value to the next step then we need to return a null value from the map() method.</br>
</br></br>
input for map is -&gt  Function &lt?, ?></br> 
first ? for resptype and second ? for input type </br>
Function &ltRespType, ReqType></br> 
--------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>FILTER</h3>

A) filter() operation is part of Stream API.</br>
B) filter() is an Intermediate Operation.</br>
C) filter() method takes as an argument Predicate functional interface and Predicate tells true or false about the predicate condition.</br>
D) filter() returns a Stream&lt;T&gt;.</br>
E) filter() method returned Stream preserves the order how they appear in the original list or Stream.</br>
F) All values in the stream must be traversed through the logic of Predicate function interface. (filter() logic).</br>
G) This will also be returning a value that is mandatory. If not returning will result in a compile-time error.</br>
H) filter() method passes the values to the next step if the filter condition is true. Otherwise, the current object will be skipped from processing in the next step.</br>


