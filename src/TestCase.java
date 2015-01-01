import java.lang.reflect.Method;

public class TestCase {
	protected String name;

	public TestCase(String name) {
		this.name = name;
	}

	public void run() throws Exception {
		try {
			Method method = this.getClass().getMethod(name, null);
			method.invoke(this, null);
		} catch (Exception e) {
			throw e;
		}
	}
}
