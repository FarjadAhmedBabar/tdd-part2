public class TestCaseTest extends TestCase {
	private WasRun test;

	public TestCaseTest(String name) {
		super(name);
	}

	public void testRunning() throws Exception {
		test.run();
		assert (test.wasRun);
	}

	public void testSetUp() throws Exception {
		try 
		{
			test.run();
			assert "setUp testMethod ".equals(this.test.log);
		} catch (Exception e) {
			
			e.printStackTrace();
			throw e;
		}
	}

	public void setUp() {
		test =new WasRun("testMethod");
	}

}
