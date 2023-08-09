package myPractice.dailyTest;

import java.util.ArrayList;
import java.util.List;

// Create a list of Employee Object (contains employee Id and employee name) and print all the elements in it

public class ListTest {

	public static void main(String[] args) {

		
		List<Employee> emp=new ArrayList<>();
		
		Employee objEmp=new Employee(1,"Vijoy");		
		
		emp.add(objEmp);
		
		emp.add(new Employee(2,"Book"));
				
		System.out.println(emp);
		

	}

}


