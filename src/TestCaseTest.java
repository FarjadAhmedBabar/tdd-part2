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
	public void testResult() throws Exception
	{
		WasRun test= new WasRun("testMethod");
		TestResult result= test.run();
		assert ("1 run, 0 failed".equalsIgnoreCase(result.summary()));
	}
}
