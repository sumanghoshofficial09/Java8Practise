package com.comparatordemo.main;
import java.util.Comparator;

/**
 * 
 * 
 * @author ciphe
 * 
 * Comparator interface has one abstract method compare 
 * 
 * compare method is use compare two inputs of any type 
 * 
 * you can write your compare logic 
 * 
 * lets check what other different things this interface has 
 * 
 * there are some other method with default keyword 
 * 
 * so what is this we know that the defintion of functional interface is to have just one abstract method right ?
 * 
 * but i see other method too in here 
 * 
 * is it not breaking the contract of functional interface 
 *??
 *
 *
 *answer is no , why we will cover it later 
 *
 *lets not worry about the default lets go ahead and implement the comparator interface 
 *
 *
 *
 *
 *
 */
public class ComparatorDemo {
	
	public static void main(String args[])
	{
		
		/**
		 * 
		 * firt we implement in the legacy way or the imperative way 
		 */
		
		Comparator<Integer> comparator1 = new  Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
				
				/**
				 * if the both value same it  will give zeo 
				 * 
				 *  if o1 is greater than o2 it will return 1 
				 *  
				 *  if o1 is less than o2  it will return -1 
				 */
			}
		};
		
		
		System.out.println(" comparing using legacy way "+ comparator1.compare(3, 2));
		
		/**
		 * 
		 * now lets implement using the lambda way 
		 * 
		 * 
		 */
		
		
		Comparator<Integer> comparator2 = (x,y) -> x.compareTo(y);
		
		System.out.println("Comparing using the lambda way "+comparator2.compare(3, 2));
		
		/**
		 * 
		 * Lambda lets you write more concise and readable code 
		 * 
		 */
	}

}
