package com.consumerdemo.main;
import java.util.List;
import java.util.function.BiConsumer;

import com.consumerdemo.data.Student;
import com.consumerdemo.data.StudentDatabase;

public class BiConsumerExample {
	
	
	public static void  nameAndGender()
	{
		
		List<Student> listOfStudents = StudentDatabase.getAllStudents();
		
		BiConsumer<String,String> biConsumerNameAndGender =  (name,gender) -> System.out.println("Name ="+name+" Gender ="+gender);
		
		listOfStudents.forEach( s -> biConsumerNameAndGender.accept(s.getName(), s.getGender()));
	}
	
	public static void main(String args[])
	{
		BiConsumer<String, String> biconsumer1 = (s1,s2) -> System.out.println("s1 ="+s1+" s2 = "+s2);
		
		biconsumer1.accept("suman", "ghosh");
		
		
		/*
		 * 
		 * lets now enhance the usecase by perform multipication of two numbers 
		 */
		
		
		BiConsumer<Integer,Integer> biConsumerMultiplicationOfTwoNumbers = (n1,n2) -> System.out.println("multiplication of two input numbers "+(n1*n2));
		
		BiConsumer<Integer,Integer> biConsumerDivisionOfTwoNumbers = (n1,n2) -> System.out.println("division of two input numbers "+(n1/n2));
		
		biConsumerMultiplicationOfTwoNumbers.andThen(biConsumerDivisionOfTwoNumbers).accept(10, 5);
		
		nameAndGender();
		
		
	}

}
