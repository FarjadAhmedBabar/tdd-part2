import java.util.ArrayList;

public class TestSuite {
	private ArrayList<WasRun> tests;

	public TestSuite() {
		tests = new ArrayList<WasRun>();
	}

	public void add(WasRun wasRun) {
		tests.add(wasRun);
	}

	public void run(TestResult result) {
		for (WasRun wasRun : tests) {
			wasRun.run(result);
		}
	}

}
