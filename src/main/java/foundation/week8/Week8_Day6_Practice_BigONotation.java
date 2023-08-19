package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day6_Practice_BigONotation{
	
	
	
	/*
	 
	 Time Complexity , 	 Space Complexity
	  
	 O(1)/ O(C)
	 
	 O(log N)
	 
	 O(N)
	 
	 O(N Square)
	 
	 O(N Log N)
	 
	 */
	
//	@Test
//	public void test()
//	{
//		Big_On_Constant(1);		
//		
//		Big_On_Constant(3);		
//		
//		Big_On_Constant(5);		
//		
//		Big_On_Constant(10);
//		
//		Big_On_Constant(100);
//		
//		Big_On_Constant(10000000);
//	}
//	
//	@Test
//	public void test()
//	{
//		Big_On_Logarithmic(1);		
//		
//		Big_On_Logarithmic(3);		
//		
//		Big_On_Logarithmic(5);		
//		
//		Big_On_Logarithmic(10);
//		
//		Big_On_Logarithmic(100);
//		
//		Big_On_Logarithmic(10000000);
//		
//		Big_On_Logarithmic(10009999);
//	}
	
//	@Test
//	public void test()
//	{
//		Big_On_Linear(1);		
//		
//		Big_On_Linear(3);		
//		
//		Big_On_Linear(5);		
//		
//		Big_On_Linear(10);
//		
//		Big_On_Linear(100);
//		
//		Big_On_Linear(10000000);
//		
//		Big_On_Linear(10009999);
//	}
//	
	@Test
	public void test()
	{
		Big_On_Quadratic(1);		
		
		Big_On_Quadratic(3);		
		
		Big_On_Quadratic(5);		
		
		Big_On_Quadratic(10);
		
		Big_On_Quadratic(100);
		
		Big_On_Quadratic(10000000);
		
		Big_On_Quadratic(10009999);
	}
	
	
	
	public void Big_On_Constant(int n)
	{	
		int counter=0;
		
		System.out.println("This is my first program");// Simple statement
		
		
		int res=1+n;
		
		counter++;
		
		System.out.println(counter);
	}
	
	
	public void Big_On_Logarithmic(int n)
	{	
		int counter=0;
		
		System.out.println("Input: "+n);
		
		while(n>0)
		{
			n=n/2;
			counter++;
		}
		
		
		System.out.println("Counter value: "+counter);
		
		System.out.println();
	}
	
	public void Big_On_Linear(int n)
	{	
		int counter=0;
		
		System.out.println("Input: "+n);
//		
//		while(n>0)
//		{
//			n=n-2;
//			//n--;
//			counter++;
//		}
		
		
		for(int i=0;i<n;i++)
		{
			counter++;
		}
		
		for(int i=0;i<n;i++)
		{
			counter++;
		}
		
		
		
		System.out.println("Counter value: "+counter);
		
		System.out.println();
	}
	
	public void Big_On_Quadratic(int n)
	{	
		int counter=0;
		
		System.out.println("Input: "+n);
//		
//		while(n>0)
//		{
//			n=n-2;
//			//n--;
//			counter++;
//		}
		
		
//		for(int i=0;i<n;i++)
//		{
			for(int j=0;j<n;j++)
			{				
				while(n>0)
				{
					n=n/2;
					counter++;
				}
			}
		//}
		
			
			while(n>0)
			{
//				n=n/2;
				counter++;
			}
		
		
		
		
		System.out.println("Counter value: "+counter);
		
		System.out.println();
	}



	

}
