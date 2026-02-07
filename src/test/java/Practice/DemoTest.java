package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups ="regression")
	public void colourTest()
	{
		Reporter.log("Balck", true);
		Reporter.log("Blue", true);
		Reporter.log("yellow", true);
		Reporter.log("Red", true);
	}
}
