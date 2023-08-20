package foundation.hackerRank;
import java.io.*;
import java.util.*;

// Link: https://www.hackerrank.com/challenges/simple-array-sum/problem

public class Temp_ExploringNewCode {

	public static int simpleArraySum(List<Integer> ar) {
		// Write your code here

		int res=0;
		for(int i=0;i<ar.size();i++)
		{
			res=res+ar.get(i) ;
		}

		return res;

	}
	
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//		List<Integer> ar = new ArrayList<>();
//
//		for (int i = 0; i < arCount; i++) {
//			int arItem = Integer.parseInt(arTemp[i]);
//			ar.add(arItem);
//		}
//
//		int result =simpleArraySum(ar);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}
	
	public static void main(String[] args)
	{
//		int arr[]= {1,2,3};
//		
//		int[] arr1=arr;
//		
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for (int i : arr1) {
//			
//		}
//		
//		System.out.println(new int[] {});
//		System.out.println(new short[] {});
//		System.out.println(new byte[] {});
//		System.out.println(new String[] {});
		
		learnArrayBehavior();
		
	}
	
	public static void learnArrayBehavior()
	{
		int[] primaryArray = {1,2,3};////789
        int[] secondaryArray = primaryArray;///
        secondaryArray[2] = 5;
        
        secondaryArray[0] = 9;
        
        System.out.println(primaryArray);
        System.out.println(secondaryArray);
        
        System.out.println(Arrays.toString(primaryArray));
        System.out.println(Arrays.toString(secondaryArray));
	}
	
	public static void exploreArrayClassMethods()
	{
		int[] primaryArray = {1,2,3};
        Arrays.toString(primaryArray);
        
        
        
//        System.out.println(Arrays.toString(primaryArray));
//        System.out.println(Arrays.toString(secondaryArray));
	}


}

