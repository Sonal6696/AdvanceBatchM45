package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test(groups ="regression")
	public void colourTest()
	{
		Reporter.log("Balck", true);
	}
}
