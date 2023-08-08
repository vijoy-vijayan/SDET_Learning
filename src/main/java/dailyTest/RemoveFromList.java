package dailyTest;

import java.util.ArrayList;
import java.util.List;


public class RemoveFromList {

	public static void main(String[] args) {
		// Given a list of strings, if any of the elements is equal to "Stop" remove that from the list
		
		List<String> strList=new ArrayList<> ();
		
		strList.add("ABC");
		strList.add("Stop");
		strList.add("Stop");
		strList.add("Last");
		strList.add("Stop");
		strList.add("Stop");
		strList.add("BK");
		strList.add("Stop");
		strList.add("VJ");
		strList.add("Stop");
		strList.add("Stop");
		strList.add("123");
		
		
//		Solution: 2
					
		
		for (int i=0;i<strList.size();i++) {
			
		
			if(strList.get(i).equals("Stop"))
			{
				strList.remove(i);
				i--;// This is my way of reversing
			}
			
		}
		
		System.out.println(strList);
		
		
	}

}
