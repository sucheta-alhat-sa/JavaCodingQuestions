package ThreadConcepts;

public class MultithreadConcept {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i=0;i<n;i++) {
			Thread thread = new Thread(new MultithreadingRunnable());
		thread.start();
		}

	}

}
