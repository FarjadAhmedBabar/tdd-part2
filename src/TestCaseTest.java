public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() throws Exception {
		try 
		{
			WasRun test =new WasRun("testMethod");
			test.run();
			assert "setUp testMethod tearDown ".equals(test.log);
		} catch (Exception e) {
			
			e.printStackTrace();
			throw e;
		}
	}
	/*public void testResult()
	{
		WasRun test= new WasRun("testMethod");
		result= test.run();
		assert("1 run, 0 failed" == result.summary());
	}*/
}
