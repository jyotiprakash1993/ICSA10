package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest 
{
	@Test
	public void demo()
	{
		Reporter.log("demo class" , true);
	}
}