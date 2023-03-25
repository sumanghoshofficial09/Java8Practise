package com.implement.runnable.main;


/**
 * 
 * @author ciphe
 * 
 * in this tutorial we implement Runnable using legacy process , having an anonymous inner class 
 * like that then we will use lambda for the same 
 * 
 * after that we compare both process and discuss the advantages over another 
 * 
 * 
 * @FunctionalInterface is not mandatory
 *
 */
public class RunnableDemo {
	public static void main(String args[])
	{
		/*
		 * implementing Runnable Interface Prior to Java 8 
		 * 
		 */
		
		Runnable runnable = new Runnable () {

			@Override
			public void run() {
				System.out.println("Running in runnable ");
				
			}
			
			
		};
		
		new Thread(runnable).start();
		
		/**
		 * go ahead and implement runnable using java 8 lambda syntax 
		 * 
		 * 
		 */
		
		new Thread(() -> System.out.println("Running in Runnable by Lambda")).start();
		
		/**
		 * 
		 * what is the difference , if you look at the legacy system and lambda system 
		 * 
		 * there are lots og boiler plate code that has been avoided by using lambda implementation 
		 * 
		 * whenever you want to use multiple line in lambda body you need to use curly braces 
		 * 
		 * for single statement in lambda body the curly braces is not needed 
		 * 
		 * no need of creating anonymous class in lambda 
		 * 'with lambda , it is evident that it allows you write more refine and readable code 
		 * 
		 * 
		 */
		/*
		 * 
		 * if you have to do in the legacy way what you can do 
		 */
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running in thread using annonymouse inner class in single line of code ");
				
			}
		}).start();
			
	}
}
