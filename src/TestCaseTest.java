
public class TestCaseTest {
	public void testRunning() {
		WasRun test = new WasRun("testMethod");
		assert !test.wasRun;
		test.run();
		assert (test.wasRun);
	}
}
