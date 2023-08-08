package testLeaf;

import java.util.HashSet;
import java.util.Set;

/*You are given a Set of Strings allWords and a String word. Your task is to write a Java method that checks if the word is in the allWords set. If the word is not in the set, the method should add it and return a message saying that the word was added. If the word is already in the set, the method should return a message saying that the word already exists in the set.

Example:
If allWords = {"apple", "banana", "cherry"} and word = "date", then the method should add "date" to the set and return "Word was added to the set".
If allWords = {"apple", "banana", "cherry"} and word = "apple", then the method should return "Word already exists in the set".
*/

public class SetHandling {
	
	

	public static void main(String[] args) {
		
		Set<String> sampleSet=new HashSet<>();
		
		String[] words= {"apple", "banana", "cherry"};
		
		for(int i=0;i<words.length;i++)
		{
			sampleSet.add(words[i]);
		}
			
		
		String resultOFSet = CheckSet(sampleSet,"cherryw");
		
		System.out.println(resultOFSet);
		
		for (String valSet : sampleSet) {
			System.out.print(valSet);
		}

	}
	
	public static String CheckSet(Set<String> sampleSet, String testString)
	{
		for (String valSet : sampleSet) {
			
			if(valSet.equals(testString)) {
				return "Word already exists in the set";				
			}
		}
		
		sampleSet.add(testString);
		
		return "Word was added to the set";
	}

}
