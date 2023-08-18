package staticDemo;

import org.testng.annotations.Test;

public class ChildCLass2 extends Baseclass {
	
	@Test(dependsOnMethods ="staticDemo.ChildCLass1.update") 
	public void print()
	{
		System.out.println("Child class 2"+name);
	}

}
