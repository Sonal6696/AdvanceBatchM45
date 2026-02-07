package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1Test {
	@Test(groups ="smoke")
	public void fuitsTest()
	{
		Reporter.log("apple", true);
		Reporter.log("orange", true);
		Reporter.log("banana", true);
	}
}
