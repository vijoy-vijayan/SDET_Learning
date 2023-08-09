package myPractice.testLeaf;

/*Write a Java function that takes an array of integers as input and returns the average of all the numbers in the array.
Example:
For the array numbers = {10, 20, 30, 40, 50}, the function should return 30.*/

public class FindAverage {

	public static void main(String[] args) {
		
		int[] testArr={10, 20, 30, 40, 100};
		
		int avg=findAvg(testArr);
		
		System.out.println(avg);
	}
	
	public static int findAvg(int[] tempArray)
	{
		int totalVal=0;
		
		for(int i=0;i<tempArray.length;i++)
		{
			totalVal=totalVal+tempArray[i];
		}
		
		return totalVal/tempArray.length;
		
	}

}
