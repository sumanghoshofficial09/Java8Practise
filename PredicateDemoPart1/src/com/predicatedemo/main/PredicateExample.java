package com.predicatedemo.main;
import java.util.function.Predicate;

public class PredicateExample {
	
	public static Predicate<Integer> checkEven = i -> i%2==0;
	
	public static Predicate<Integer> checkDivisibleBy5 = i -> i%5==0;
	
	public static void predicateAnd()
	{
		
		System.out.println(checkEven.and(checkDivisibleBy5).test(12));
		/**
		 * this is called Predicate Chaining 
		 * 
		 */
		
	}
	
	public static void predicateOr()
	{
		
		System.out.println(checkEven.or(checkDivisibleBy5).test(13));
		/**
		 * post chaining , we will always have to pass the input to 
		 * test method 
		 * 
		 */
	}
	
	public static void predicateNegate()
	{
		System.out.println(checkEven.or(checkDivisibleBy5).negate().test(13));
	}
	
	public static void main(String args[])
	{
		
		
		
		System.out.println("the number is even or not "+checkEven.test(6));
		
		predicateAnd();
		
		predicateOr();
		predicateNegate();
		/**
		 * 
		 * now you are wondering that I can do the same operation without using 
		 * predicate functional interface 
		 * 
		 * then what is the benefit over here , the benefit is over code reusability 
		 * 
		 * we will see that part later in the course 
		 * 
		 * we can use the same predicate function interface implementation 
		 * 
		 * n numner of time through out our project 
		 * 
		 * 
		 * 
		 * lambda body is single statement we dont need curly braces and dont need 
		 * 
		 * return key word 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	

}
