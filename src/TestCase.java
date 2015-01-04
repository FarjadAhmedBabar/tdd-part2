import java.lang.reflect.Method;

public class TestCase {
	protected String name;

	public TestCase(String name) {
		this.name = name;
	}

	public void run(TestResult result)  {
		setUp();
		result.testStarted();
		try {
			Method method = this.getClass().getMethod(name, null);
			method.invoke(this, null);
		} catch (Exception e) {
			result.testFailed();
		} finally {
			tearDown();
		}
	}

	public void tearDown() {

	}

	public void setUp() {
	}
}
