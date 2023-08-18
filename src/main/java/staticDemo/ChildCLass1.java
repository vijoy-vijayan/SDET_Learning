package staticDemo;

import org.testng.annotations.Test;

public class ChildCLass1 extends Baseclass {
	
	
	@Test
	public void update()
	{
		System.out.println("Child CLass1 -->  Initial name:"+name);
		
		name=name+" Godse";
		
		System.out.println("Child CLass1 -->  Updated name:"+name);
	}

}
