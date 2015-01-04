public class TestResult {
	int runCount = 0;
	int failCount = 0;
	public void testStarted() {
		this.runCount = this.runCount + 1;
	}

	public String summary() {
		return runCount + " run, "+failCount+" failed";
	}

	public void testFailed() {
		this.failCount = this.failCount + 1;
	}

}
