public class TestCaseTest extends TestCase {
	private TestResult result ;
	public TestCaseTest(String name) {
		super(name);
	}

	public void testTemplateMethod() throws Exception {
		try {
			WasRun test = new WasRun("testMethod");
			test.run(result);
			assert "setUp testMethod tearDown ".equals(test.log);
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		}
	}

	public void testResult() throws Exception {
		WasRun test = new WasRun("testMethod");
		test.run(result);
		assert ("1 run, 0 failed".equalsIgnoreCase(result.summary()));
	}

	public void testFailedResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		assert ("1 run, 1 failed" == result.summary());
	}

	public void testFailedResult() {
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = new TestResult();
		test.run(result);
		assert ("1 run, 1 failed".equalsIgnoreCase(result.summary()));
	}

	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(result);
		assert ("2 run, 1 failed".equalsIgnoreCase(result.summary()));
	}
	public void setUp() {
		result = new TestResult();
	}
}
