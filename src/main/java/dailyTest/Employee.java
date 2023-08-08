package dailyTest;

public class Employee {
	
	public int empId;
	public String empName;
	
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	

	public String toString() {
		return empId + ": " + empName;
	   }
	
}
