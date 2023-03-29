package com.consumerdemo.main;

import java.util.List;
import java.util.function.Predicate;

import com.consumerdemo.data.Student;
import com.consumerdemo.data.StudentDatabase;

public class PredicateExample2 {
	
	static Predicate<Student> p1 = s -> s.getGradeLevel()>=2;
	static Predicate<Student> p2 = s -> s.getGpa()>=2;
	
	public static void filterStudentByGradeLevel()
	{
		List<Student> studentList= StudentDatabase.getAllStudents();
		
		
		studentList.forEach(s -> {
			
			if(p1.test(s))
				System.out.println(s);
			
			
			
		}
		
		);
	}
	
	public static void filterStudentByGradeOrGpa()
	{
		List<Student> studentList= StudentDatabase.getAllStudents();
		
		studentList.forEach(s -> {
			
		    if(p1.or(p2).test(s))
		    {
		    	System.out.println(s);
		    }
		    
		    /**
		     * 
		     * the lamba always help you to resuse the code 
		     * 
		     * it help us building the project realy faster 
		     */
			
		});
		
	}
	
	public static void main(String args[])
	{
		
		filterStudentByGradeLevel();
		
		System.out.println("============================");
		filterStudentByGradeOrGpa();
		
	}

}
