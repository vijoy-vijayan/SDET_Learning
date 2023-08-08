package testLeaf;

public class NumberOfWords {
	
	/*
	 * You are provided with a String variable sentence that contains a sentence of words. Write a Java method that returns the number of words in the sentence. Consider any sequence of non-space characters to be a word.
	Example:
	For sentence = "The quick brown fox jumps over the lazy dog.";, the method should return 9.*/

	public static void main(String[] args) {
		
		int totalWords=findNoOfWords("The quick brown fox jumps over the lazy dog. vijoy Vijayan");
		
		System.out.println(totalWords);
		

	}
	
	public static int findNoOfWords(String tempString)
	{
		return  tempString.split(" ").length;
		
	}

}
