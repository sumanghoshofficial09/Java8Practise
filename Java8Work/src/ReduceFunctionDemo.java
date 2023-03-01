import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * 
 * In Java, reducing is a terminal operation that aggregates a stream into a type or a primitive type. Java 8 provides Stream API contains set of predefined reduction operations such as average(), sum(), min(), max(), and count(). These operations return a value by combining the elements of a stream. In Java, reduce() is a method of the Stream interface. In this section, we will discuss the Java Stream.reduce() method in detail.
 * 
 * 
 * it is the method of combining all elements
 * 
 * for each element present in stream , reduce method appllies the 
 *  binary operator 
 *  
 *  
 *  it allows to produce single result from a sequence of elements, by repeatedly applying combining operation to the element 
 *  
 * 
 */
public class ReduceFunctionDemo {
	
	
	public static void main(String args[])
	{
		//create a list of names to perform operations :
		
		
		List<String> nameList =Arrays.asList("suman","puja");
		
		
		Optional<String> optionString=     nameList.stream().reduce((a,b) -> a.length() > b.length() ? a: b);
		
		optionString.ifPresent(System.out::println);
		
		
		List<Integer> numberList= Arrays.asList(1,2,3,4);
		
		Optional<Integer> optionInteger= Optional.ofNullable(numberList.stream().reduce(0,(a,b)-> a+b));
		
		optionInteger.ifPresent(System.out::println);
	}
	
	

}
