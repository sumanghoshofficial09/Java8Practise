package com.consumerdemo.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	
	public static List<Student> getAllStudents()
	{
		
		Student s1 = new Student("suman", 1, 2, "male");
		Student s2 = new Student("puja", 2, 1, "female");
		
		
		List<Student> students = Arrays.asList(s1,s2);
		
		return students;
		
		/**
		 * 
		 * we are going to use this data in order to explore some of the 
		 * 
		 * real world scenario 
		 * 
		 */
	}

}
