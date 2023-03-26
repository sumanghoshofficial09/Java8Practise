package com.consumerdemo.main;
import java.util.List;
import java.util.function.Consumer;

import com.consumerdemo.data.Student;
import com.consumerdemo.data.StudentDatabase;

public class ConsumerDemo {
	
	static Consumer<Student> printNameCosnumer = student -> System.out.println(student.getName());
	static Consumer<Student> printGenderCosnumer = student -> System.out.println(student.getGender());
	
	
	public static void printName()
	{
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		/**
		 * 
		 * now we are going iterate these students one by one 
		 * using the help of consumer interface 
		 * 
		 * we are going to print the student one by one using foreah 
		 * 
		 * the foreach will take consumer as input
		 * 
		 */
		
		Consumer<Student> consumer2 = student -> System.out.println(student);
		
		studentList.forEach(consumer2);
	}
	
	
	/*
	 * 
	 * lets explore consumer by adding some more usecases 
	 * 
	 */
	
	public static void printNamesAndGender()
	{
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		
		
		studentList.forEach(printNameCosnumer.andThen(printGenderCosnumer));
		
		/*
		 * 
		 * the using of method andThen is called Consumer chaining 
		 */
		
	}
	
	/**
	 * 
	 * @param args
	 * 
	 * we are going to use some condition with Consumer Interface 
	 * 
	 */
	
	public static void printNameAndGenderUsingConditon()
	{
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach(s -> {
			
			if(s.getGpa() == 2)
			{
				printNameCosnumer.andThen(printGenderCosnumer).accept(s);
			}
			
			/*
			 * 
			 * by using andThen we can chain n number of Consumer interfaces 
			 * implementation 
			 * 
			 */
		});
	}
	public static void main(String args[])
	{
		
		Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
		
		/**
		 * next step is how to pass the input to the functional interface 
		 * 
		 * and how it is going to perform the print and uppercase operaation 
		 *  on the input we are going to pass
		 */
		
		c1.accept("suman");
		
		/*
		 * it performs the operation whatever we have instructed to Consumer 
		 * 
		 * Interface 
		 */
		
		
		/*
		 * now the call the new printName method 
		 */
		
		printName();
		
		printNamesAndGender();
		
		System.out.println("============================");
		
		printNameAndGenderUsingConditon();
	}

}
