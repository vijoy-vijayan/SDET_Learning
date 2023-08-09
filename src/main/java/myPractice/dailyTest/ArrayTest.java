package myPractice.dailyTest;

import java.util.Arrays;

public abstract class ArrayTest {	
	
	
	//Sort an array of integers and print it
	

	public static void main(String[] args) {
		
		RemoveOdd();
		
	}
	
	
	public static void RemoveOdd()
	{
		
		int[] arrInput= {1,2,3,4,5,6,7,8,9,10};
		
		String tempStr="";
		
		for(int i=0;i<arrInput.length;i++) 
		{
			if(arrInput[i]%2==0) {
				
//				System.out.println(1+": "+tempStr);
				
				tempStr=tempStr+arrInput[i]+",";
				
			}
		}
		
//		tempStr=tempStr.substring(0, tempStr.length()-1);
		
		System.out.println(tempStr);
		String[] temp=tempStr.split(",");
		
		System.out.println(Arrays.toString(temp));
		
//		int[] newArr=new int[temp.length];
//		
//		System.out.println(temp.length);
//		
//		for(int i=0;i<temp.length;i++)
//		{
//			newArr[i]=Integer.parseInt(temp[i]);
//		}
//		
//		System.out.println(Arrays.toString(newArr));
//		
	}
	
	
	// This is SOrt function I think
	
	public static void sort() {
		// TODO Auto-generated method stub
		
		int[] arrInput= {5,2,1,3,4};
		int temp;
		
	
		// Brute force technique
		//Memory n*n-1 = n square
		for(int i=0;i<arrInput.length;i++)
		{
			for(int j=i+1;j<arrInput.length;j++)
			{
				if(arrInput[i]>arrInput[j])
				{
					temp=arrInput[i];
					arrInput[i]=arrInput[j];
					arrInput[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(arrInput));		
		
		Arrays.sort(arrInput);
		
		
	

	}

}
