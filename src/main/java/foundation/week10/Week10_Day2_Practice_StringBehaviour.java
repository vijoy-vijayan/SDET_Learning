package foundation.week10;

import org.junit.Assert;
import org.junit.Test;


public class Week10_Day2_Practice_StringBehaviour extends Object {

	public static void main(String[] args) {





		String name="Suyog";

		String name2=new String("Suyog");

		if(name==name2) {//Shallow
			System.out.println("Same String");
			System.out.println("Name and Name2 has the same memory reference");
		}
		else {
			System.out.println("Different String");
			System.out.println("Name and Name2 has the different memory reference");

		}

		if(name.equals(name2)) {//Deep
			System.out.println("Same String");
			System.out.println("Name and Name2 has the same value");
		}
		else {
			System.out.println("Different String");
			System.out.println("Name and Name2 has the different value");

		}

/*
		int favNo=9;



		System.out.println("Initial Favourite Number: "+favNo);

		changeFavNo(favNo);

		System.out.println("Favourite Number after Changing: "+favNo);


		System.out.println("Initial Name: "+name);

		changeName(name);

		System.out.println("Name after Changing: "+name);
*/

	}
	private static void changeName(String name)
	{
		name="Suyog Godse";
		System.out.println("Updated Name: "+name);
	}

	private static void changeFavNo(int favNo)

	{
		favNo=2;
		System.out.println("Fav Number changed:"+ favNo);

	}
}

