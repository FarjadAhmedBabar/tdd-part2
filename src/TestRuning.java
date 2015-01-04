
public class TestRuning {

	public static void main(String[] args) {
		try {
			new TestCaseTest("testTemplateMethod").run();
			new TestCaseTest("testResult").run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
