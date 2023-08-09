package foundation.week4;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;


/*
Pseudo code:
1. Get the array and iterate throgh nested loop .. total=0

2. Outer loop to find the maximum stock for a given day(Last element in array need not be compared as there is no selling possible)
3. Inner for loop calculates the total for each Day.. Update total only if arr[i+1]>arr[i]
4. Return total at the end


*/

public class ClassTest3_BuyAndSellStock {
	public int maxProfit(int[] prices) {

		int total=0, temp=0;

		for(int i=0;i<prices.length-1;i++)
		{

			for(int j=i+1;j<prices.length;j++)
			{
				if((prices[j]>prices[i]))
				{
					temp=prices[j]-prices[i];
					if(temp>total)
						total=temp;
				}
			}
		}

		return total;

	}
}



