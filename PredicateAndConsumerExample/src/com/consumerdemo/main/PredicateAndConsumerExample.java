package com.consumerdemo.main;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.consumerdemo.data.Student;
import com.consumerdemo.data.StudentDatabase;

/**
 * 
 * @author ciphe
 *
 *Predicate and Consumer together 
 *
 */
public class PredicateAndConsumerExample {
	
	static Predicate<Student> filterGpa =  s -> s.getGpa() >= 2;
	
	static Predicate<Student> filterGrade = s -> s.getGradeLevel() >=2;
	
	static BiConsumer<String, String> printNameAndGenderBiConsumer =  (Name,Gender) -> System.out.println("Name is "+Name+ " Gender is "+Gender);
	
	static Consumer<Student>  studentFilteringAndPrintingNameAndGenderConsumer = s -> {
		
		if(filterGpa.or(filterGrade).test(s))
		{
			printNameAndGenderBiConsumer.accept(s.getName(), s.getGender());
		}
	}; 
	
	static void printNameAndGender()
	{
		
		List<Student> studentList = StudentDatabase.getAllStudents();
		
		studentList.forEach(studentFilteringAndPrintingNameAndGenderConsumer);
	}
	
	
	public static void main(String args[])
	{
		printNameAndGender();
	}
	
	
	

}
