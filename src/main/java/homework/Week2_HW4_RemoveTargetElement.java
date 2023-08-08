package homework;

import org.junit.Assert;
import org.junit.Test;

/*HW6--> Problem Statement: Remove the target element in the array

Input: int Array and Target as int
Output : int Array


Method1:
Pseudo code:
1. Get the input array and target
2. Loop through the array once to find the target ctr
3. Return input array if the target ctr=0
4. Create the new array with size as size = input array size - Target ctr
5. Iterate through the array 1 and add all the non target elements to New array
6. Return new array

Method2:
Pseudo code:
1. Create an Empty List
2. Iterate through the input array  Condition : input[i]!= target  --> List.add (input(i))
3. return list at the end

 */

public class Week2_HW4_RemoveTargetElement{
	
	@Test
	public void Positivetest()
	{
		Assert.assertArrayEquals(new int[] {3,3, 4, 5},RemoveTargetElement(new int[] {2, 3, 3, 4, 5},2));
				
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

}
