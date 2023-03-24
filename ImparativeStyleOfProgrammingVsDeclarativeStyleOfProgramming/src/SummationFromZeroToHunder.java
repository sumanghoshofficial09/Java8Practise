import java.util.stream.IntStream;

public class SummationFromZeroToHunder {
	
	public static void main(String args[])
	{
		
		/*
		 * 
		 * 
		 * Imperative Style : How style of programming
		 * 
		 */
		
		int sum=0;
		
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
		
		System.out.println("Sum using imperative approach "+sum);
		
		/*
		 * 
		 * Declarative style  : What style of programming 
		 * 
		 * I am going to use the function that is introduced in java8 in order to achieve the same goal 
		 * 
		 */
		
		int sum1 =   IntStream.rangeClosed(0, 100).sum();
		System.out.println("Sum using declarative style of programming "+sum1);
		
		/*
		 * parallel and multithreaded env 
		 * 
		 */
		int sum2  = IntStream.rangeClosed(0, 100).parallel().sum();
		System.out.println("Sum using declarative style of programming in parellel mode "+sum2);
		
		
		/**
		 * let compare the both approach 
		 * 
		 * above imperative approach we define how the summation needs to be done 
		 * 
		 * look at that we have an mutable variable here 
		 * 
		 * we are mutating the variables  to  get the result 
		 * if we try to run the code in multi threaded , we are going to have lots of problem in this code 
		 * 
		 * 
		 * in code reader perspective you try to read the code line by line it is problematic 
		 * not readable 
		 * 
		 * in reality some usecase can lead to write very complex code in case of imperative style of programming 
		 * 
		 * 
		 * now lets take a look at the declarative approach 
		 * 
		 * 
		 * in this case   we dont need to perform each and every step 
		 * 
		 * we just calling IntStream.rangeclosed method and 
		 * 
		 * also declarative peice of code will run in the multi threaded environment 
		 * 
		 * running the declarative code in multi threaded environment  is very easy 
		 * 
		 * 
		 * lets say in declarative style of code  i want to do the summation in parallel  in multithreaded env 
		 * 
		 * ther is very easy way to do 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}

}
