

public class WasRun extends TestCase {
	public boolean wasRun;
	public boolean wasSetUp;
	public String log;

	public WasRun(String name) {
		super(name);
		this.wasRun = false;
	}

	public void testMethod() {
		this.wasRun = true;
		this.log= this.log + "testMethod ";
		}

	public void setUp() {
		this.wasRun = false;
		this.wasSetUp = true;
		this.log= "setUp ";
	}

}
