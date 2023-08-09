package myPractice.classMethodsLearning;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="Petco";
		
		String str1="Pevco";
		
//		System.out.println(str.charAt(6));
		
//		System.out.println(str.codePointAt(6));
		
//		System.out.println(str.codePointCount(0,6));
		
		System.out.println(str.compareTo(str1));
		
		swapingWithout3rdVarible();
		
	}
		
		static int x = 10;
		static int y = 20;
		
		
		public static void swapingWithout3rdVarible(){ 
			System.out.println("Before swap:");
			System.out.println("x value: "+x);
			System.out.println("y value: "+y);
			x=x^y;
			y=x^y;
			x=x^y;
			System.out.println("After swap:");
			System.out.println("x value: "+x);
			System.out.println("y value: "+y);


	}

}
