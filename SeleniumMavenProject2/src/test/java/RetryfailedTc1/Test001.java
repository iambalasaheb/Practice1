package RetryfailedTc1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	@Test(retryAnalyzer = RetryfailedTc1.RetryAnalyzer.class)
	public void Test1()
	{
		AssertJUnit.assertEquals(false, true);
	}

	@Test(retryAnalyzer = RetryfailedTc1.RetryAnalyzer.class)
	public void Test2()
	{
		AssertJUnit.assertEquals(false, true);
	}
}
/*when we want to run any test case no. of time then we need to implement 
 * the logic as "(retryAnalyzer = RetryfailedTc1.RetryAnalyzer.class)" to triger that method again and
 * again at required repitation*/
