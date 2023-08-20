package foundation.week8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;


public class Week8_Day7_Practice_EmployeeArrConstruction{

	private String[] empName=new String[10];

	private String[] empAge=new String[10];


	public void getEmployeeDetails()
	{
		for (int i = 0; i < empName.length; i++)
			System.out.println("Employee Name: "+empName[i]+".....    Employee Age: "+empAge[i]);
	}

	public void getSpecificEmployee(int i)
	{
		System.out.println("Employee Name: "+empName[i]+".....    Employee Age: "+empAge[i]);
	}

	public void setEmployeeName()
	{
		String[] tempEmpName= {"Emp1","Emp2","Emp3","Emp4","Emp5","Emp6","Emp7","Emp8","Emp9","Emp10"};

		for (int i = 0; i < empName.length; i++) 
			empName[i]=tempEmpName[i];
		

	}

	public void setEmployeeAge()
	{
		String[] tempEmpAge= {"21","22","23","24","25","26","27","28","29","30"};

		for (int i = 0; i < empName.length; i++) 
			empAge[i]=tempEmpAge[i];

	}

	//Activity is that, construct an array like int[], boolean[].


	@Test
	public void checkEmployee()
	{
//		setEmployeeName();
//		setEmployeeAge();
//		getEmployeeDetails();		
//		getSpecificEmployee(5);
		int n=10;
		Employee obj=new Employee(n);
		
//		String[] tempEmpName= {"Emp1","Emp2","Emp3","Emp4","Emp5","Emp6","Emp7","Emp8","Emp9","Emp10"};
//		int[] tempEmpAge= {"21","22","23","24","25","26","27","28","29","30"};
		
		String[] tempEmpName=new String[n];
		int[] tempEmpAge = new int[n];
		
		for (int i = 0; i < tempEmpName.length; i++) {
			tempEmpName[i]="Employee"+i;
			tempEmpAge[i]=20+i;
		}
		obj.setEmployeeDetails(tempEmpName,tempEmpAge);
		
		obj.getEmployeeDetails();
		
		obj.getSpecificEmployee(5);
		
		ArrayList<Integer> temp=new ArrayList<Integer>();
		
		
		
//		System.out.println();
	}


}


