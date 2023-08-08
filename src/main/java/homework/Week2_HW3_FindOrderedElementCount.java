package homework;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
Given an integer array arr, count how many elements x there are, such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately

Input: int Array
Output : int

Pseudo code:
1. Get the array and iterate through it with the inner loop for comparing all elements
2. Increase the counter if x==x+1
3. Return counter at the end
 */
public class Week2_HW3_FindOrderedElementCount{
	
	@Test
	public void Positivetest()
	{
		Assert.assertEquals(2,FindOrderedElementsCount(new int[] {1, 2, 3}));
		Assert.assertEquals(0,FindOrderedElementsCount(new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
		
	}
	
	@Test
	public void Negativetest()
	{
		Assert.assertEquals(0,FindOrderedElementsCount(new int[] {}));
	}
	
	@Test
	public void Edgetest()
	{
		Assert.assertEquals(2,FindOrderedElementsCount(new int[] {1,1,2}));
		Assert.assertEquals(0,FindOrderedElementsCount(new int[] {9}));
	}
	
	public int FindOrderedElementsCount(int[] arrInput)
	{
		int ctr=0;
		
		if(arrInput.length==1 || arrInput.length==0)
			return ctr;

				
		for(int i=0;i<arrInput.length;i++)
		{
			for(int j=i+1;j<arrInput.length;j++)
			{				
				if(arrInput[i]+1==arrInput[j])
					ctr++;
			}
							
		}		
		
		return ctr;
	}

}
