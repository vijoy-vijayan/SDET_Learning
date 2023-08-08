package dailyTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {

//1. Create a treeset and iterate the values using an iterator
//2. Print the tree set in descending order
		
		Set<String> objTreeSet=new TreeSet<> ();
		
		objTreeSet.add("P");
		objTreeSet.add("E");
		objTreeSet.add("T");
		objTreeSet.add("C");
		objTreeSet.add("O");
		
		
		System.out.println(objTreeSet);
		
		for (String string : objTreeSet) {
			
			System.out.println(string);
			
		}
		
		
		List<String> objList=new ArrayList<> (objTreeSet);
		
		Collections.sort(objList);
		
		System.out.println(objList);
		
		Collections.reverse(objList);
		
		System.out.println(objList);
		
		
		
		

	}

}
