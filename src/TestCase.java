import java.lang.reflect.Method;

public class TestCase {
	protected String name;

	public TestCase(String name) {
		this.name = name;
	}

	public TestResult run() throws Exception {
		TestResult result = new TestResult();
		try {
			result.testStarted();
			setUp();
			Method method = this.getClass().getMethod(name, null);
			method.invoke(this, null);
			tearDown();
		} catch (Exception e) {
			throw e;
		}
		return result;
	}

	public void tearDown() {

	}

	public void setUp() {
	}
}
