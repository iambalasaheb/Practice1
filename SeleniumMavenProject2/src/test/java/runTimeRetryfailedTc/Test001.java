package runTimeRetryfailedTc;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	
  @Test()
  public void Test1() {
	AssertJUnit.assertEquals(false, true);  
  }
  @Test
  public void Test2() {
	  AssertJUnit.assertEquals(false, true);
  }
}
