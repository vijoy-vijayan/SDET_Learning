package myPractice.dailyTest;

public class Day2TestString {
	
	public static void main(String[] args) {
		
		String testStr="malayalam";
		
					
		
		
//		System.out.println(AddString(firstName,lastName));
		
		if(testStr!=null)
			System.out.println(Palindrome(testStr));
		
		
	}
	
	public static boolean Palindrome(String tempStr) {
		
		int strLen=tempStr.length();
		
		System.out.println(strLen);
		
		for(int i=0;i<strLen/2;i++)
		{
			System.out.println("*********** "+i);
			if(tempStr.charAt(i)!=tempStr.charAt(strLen-i-1))
				return false;
		}
		
		return true;
	}

	public static boolean checkEquality(String tempStr1, String tempStr2) {		
		
		return tempStr1==tempStr2;	
	
	}
	
	public static int WordCount(String tempStr) {		
		
		return tempStr.split(" ").length;		
	
	}
	
	public static String AddString(String str1, String str2) {
		
		if(str1.length()<8)
			return str1.concat(" "+str2);
		else
			return "Name Merge is Not Needed";
	}
	
	public static String RemoveSpaces(String tempStr)
	{
				if(!tempStr.isEmpty())
					tempStr = tempStr.replaceAll("\\s+", "");
				else
					System.out.println("Empty String is passed");
	
			
				
		return tempStr;
	}
	
	public static int LastIndex(String tempStr, String substr)
	{
				
		return tempStr.lastIndexOf(substr)+substr.length();
	}

}
