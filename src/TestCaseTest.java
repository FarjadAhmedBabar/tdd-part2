public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() throws Exception {
		try 
		{
			WasRun test =new WasRun("testMethod");
			test.run();
			assert "setUp testMethod ".equals(test.log);
		} catch (Exception e) {
			
			e.printStackTrace();
			throw e;
		}
	}
}
