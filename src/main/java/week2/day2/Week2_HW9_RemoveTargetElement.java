package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/* 
Problem statement: Remove the target element in the array
       
 example 1: input = [2, 3, 3, 4, 5], target=3
      output = [2, 4, 5]
      explanation: when 3 is removed from input array, 
       output is [2, 4, 5]
 
Input 			----->  	int[] and Target as int
Output 			----->  	int[]
 
 
Data Set:
	 Positive: 	Input: {2, 3, 3, 4, 5}, Target: 3			---> 		Output = {2,4,5}
	 Negative: 	Input: 	{1,3,5,8}, Target:7					---> 		Output = {1,3,5,8}
	 Edge: 		Input: 	{6,6,6,6,6}, Target: 6				---> 		Output = {}
 

Pseudo code:
Method1:
1. Get the input array and target
2. Loop through the array once to find the target ctr
3. Return input array if the target ctr=0
4. Create the new array with size as size = input array size - Target ctr
5. Iterate through the array 1 and add all the non target elements to New array
6. Return new array

Method2:
1. Create an Empty List
2. Iterate through the input array  Condition : input[i]!= target  --> List.add (input(i))
3. return list at the end
 
 */

public class Week2_HW9_RemoveTargetElement {
	
	@Test
	public void positiveTest()
	{
		Assert.assertArrayEquals(new int[] {3,3, 4, 5},RemoveTargetElement(new int[] {2, 3, 3, 4, 5},2));
		
	}
	
	@Test
	public void negativeTest()
	{
		Assert.assertArrayEquals(new int[] {1,3,5,8},RemoveTargetElement(new int[] {1,3,5,8},7));
	}
	
	@Test
	public void edgeTest()
	{
		Assert.assertArrayEquals(new int[] {},RemoveTargetElement(new int[] {6,6,6,6,6},6));
	}


	public int[] RemoveTargetElement(int[] arrInput, int target)
	{
		int ctr=0;
		
		for(int i=0;i<arrInput.length;i++)
		{
			if(arrInput[i]==target)
				ctr++;
		}
		
		if (ctr==0)
			return arrInput;
		
		int[] arrOutput =new int[arrInput.length-ctr];
		
		ctr=0;
		
		for(int i=0;i<arrInput.length;i++)
		{
			if(arrInput[i]!=target)
			{
				arrOutput[ctr]=arrInput[i];	
				ctr++;
			}
		}	
						
		return arrOutput;
	}
	
//	public int[] RemoveTargetElement_List(int[] arrInput, int target)
//	{
//		int ctr=0;
//		
//		List<Integer> objList=new ArrayList<Integer>();
//		
//		for(int i=0;i<arrInput.length;i++)
//		{
//			if(arrInput[i]!=target)
//				objList.add(arrInput[i]);
//		}
//					
//		
//		return objList.toArray;
//	}

}
