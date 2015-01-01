import java.lang.reflect.Method;

public class WasRun extends TestCase{
	public boolean wasRun;
	

	public WasRun(String name)
	{
		super(name);
		this.wasRun = false;
	}

	public void testMethod() {
		this.wasRun = true;
	}

	public void run() {
		try {
			Method method = this.getClass().getMethod(super.name, null);
			method.invoke(this, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
