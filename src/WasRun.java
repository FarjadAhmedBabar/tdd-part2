import java.lang.reflect.Method;

public class WasRun extends TestCase{
	private boolean wasRun;
	

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

	/*public static void main(String[] args) {
		try {
			WasRun test = new WasRun("testMethod");
			 assert !test.wasRun;
			test.run();
			assert test.wasRun;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}*/
}
