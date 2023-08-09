package foundation.week3.day2;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class HW10_IntersectionOfArray {

	/*

Problem statement: 	 
Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any order.


	Input 			----->  	int[], int[]
	Output 			----->  	int[]


	Data Set:
		 Positive: 		---> Input: [1,2,2,1], [2,2]						Output = [2]
		 Negative: 		---> Input: [4,9,5], [9,4,9,8,4]					Output = [9,4]
		 Edge: 			---> Input: 9999									Output = 9999


Pseudo Code:
 1. Get the input array and iterate in Nested loop -- Outer loop for Pivot .. LeftSum=0, RIghtSum=0
 2. In the inner loop, write the logic before pivot index and After Pivot Index  .. i> j .. ELse
 3. After the end of inner loop check for the condition of sum matching.. Return Index if matches
 4. Return -1 at the end

	 */

	@Test
	public void positiveTest()
	{
//		Assert.assertArrayEquals(new int[] {4,9}, getArrayIntersection(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
//		Assert.assertArrayEquals(new int[] {2}, getArrayIntersection(new int[] {1,2,2,1}, new int[] {2,2}));
//		
//		Assert.assertArrayEquals(new int[] {1}, getArrayIntersection(new int[] {1,2}, new int[] {1,1}));
//		
//		Assert.assertArrayEquals(new int[] {3}, getArrayIntersection(new int[] {7,2,2,4,7,0,3,4,5}, new int[] {3,9,8,6,1,9}));
		
		Assert.assertArrayEquals(new int[] {0,4,5,6,7,34,38,44,45,57,61,77,79,85,88,89,92}, getArrayIntersection(new int[] {61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81}, new int[] {5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48}));
	}

//	@Test
//	public void negativeTest()
//	{
//		Assert.assertArrayEquals(new int[] {}, getArrayIntersection(new int[] {1,2,3}, new int[] {4}));
//	}
//
//	@Test
//	public void edgeTest()
//	{
//		Assert.assertArrayEquals(new int[] {4,5}, getArrayIntersection(new int[] {4,5}, new int[] {5,4}));
//	}

	public int[] getArrayIntersection(int[] inputArr1, int[] inputArr2)	
	{

		return (inputArr1.length>inputArr2.length) ? findIntersection(inputArr2,inputArr1):findIntersection(inputArr1,inputArr2);
	}

	public int[] findIntersection(int[] inputArr1, int[] inputArr2)	
	{
		Arrays.sort(inputArr1);
		Arrays.sort(inputArr2);

		int pointer=0,resTracker=0;

		boolean flag=false;

		for (int i=0;i<inputArr1.length;i++) {

			flag=false;

			if(i>0 && (inputArr1[i]==inputArr1[i-1]) )
				continue;

			while(inputArr1[i]>=inputArr2[pointer])
			{

				if(inputArr1[i]==inputArr2[pointer])
				{
					inputArr2[resTracker]=inputArr1[i];
					flag=true;
					resTracker++;
				}					

				pointer++;

				if(flag || (pointer==inputArr2.length))
					break;
			}
			
			
			if(pointer==inputArr2.length)
				break;

		}


		int[] resArr=new int[resTracker];

		for(int i=0; i<resArr.length;i++)
			resArr[i]=inputArr2[i];

		return resArr;
	}



}

