public class WasRun {
	private boolean wasRun;

	public WasRun(String name) {
		this.wasRun = false;
	}

	public void testMethod() {
		this.wasRun = true;
	}

	public static void main(String[] args) {
		WasRun test=new WasRun("testMethod");
		System.out.println("before Calling="+test.wasRun);
		test.testMethod();
		System.out.println("After Calling="+test.wasRun);
	}
}
