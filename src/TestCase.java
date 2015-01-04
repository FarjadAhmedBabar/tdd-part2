import java.lang.reflect.Method;

public class TestCase {
	protected String name;

	public TestCase(String name) {
		this.name = name;
	}

	public void run() throws Exception {
		try {
			setUp();
			Method method = this.getClass().getMethod(name, null);
			method.invoke(this, null);
			tearDown();
		} catch (Exception e) {
			throw e;
		}
	}
	public void tearDown() {
		
	}

	public void setUp(){}
}
