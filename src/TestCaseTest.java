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
		test.run();
		assert test.wasSetUp;
	}

	public void setUp() {
		test =new WasRun("testMethod");
	}

}
