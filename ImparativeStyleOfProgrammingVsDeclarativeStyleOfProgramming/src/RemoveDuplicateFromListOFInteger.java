import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * remove duplicates from the list of integers 
 * 
 * Imperative vs Declarative 
 */
public class RemoveDuplicateFromListOFInteger {
	
	public static void main(String args[])
	{
		
		List<Integer> integerList = Arrays.asList(1,2,3,3,4,5,5,6);
		
		/**
		 * 
		 * let do with first imperative approach 
		 * 
		 */
		
		List<Integer> uniqueListList = new ArrayList<>();
		
		for(Integer intg  : integerList)
		{
			if(!uniqueListList.contains(intg))
			{
				uniqueListList.add(intg);
			}
		}
		
		System.out.println("Imperative way of coding "+uniqueListList);
		
		/*
		 * 
		 * declarative style of coding 
		 * 
		 * here you can see that we are not writing any specific logic or algorithm in fidning the unique elements 
		 * 
		 * 
		 */
		
		List<Integer> uniqueIntegrList1=integerList.stream().distinct().toList();
		
		System.out.println("declarative way of coding "+uniqueIntegrList1);
	}

}
