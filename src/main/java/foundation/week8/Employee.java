package foundation.week8;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;


public class Employee{

	private String[] empName;

	private int[] empAge;

	Employee(int n)
	{
		empName=new String[n];
		empAge=new int[n];
	}

	public void setEmployeeDetails(String[] name, int[] age)
	{
		for (int i = 0; i < empName.length; i++)
		{
			empName[i]=name[i];
			empAge[i]=age[i];
		}
		
		System.out.println("Added all the Employee details successfully");

	}

	public void getEmployeeDetails()
	{
		for (int i = 0; i < empName.length; i++)
			System.out.println("Employee Name: "+empName[i]+".....    Employee Age: "+empAge[i]);
	}

	public void getSpecificEmployee(int i)
	{
		System.out.println("\nEmployee Name: "+empName[i]+".....    Employee Age: "+empAge[i]);
	}


}


