
public class TestRuning {

	public static void main(String[] args) {
		try {
			new TestCaseTest("testSuite").run(new TestResult());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
