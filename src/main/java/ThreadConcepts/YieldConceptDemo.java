package ThreadConcepts;

public class YieldConceptDemo implements Runnable {

	public static void main(String[] args) {
		YieldConceptDemo y1 = new YieldConceptDemo();
		
		//creating the first thread
		Thread t1 = new Thread(y1, "First child Thread");
		
		YieldConceptDemo y2 = new YieldConceptDemo();
		//second thread
		Thread t2 = new Thread(y1, "Second child Thread");
		
		//calling the thread will execute the run() function
		t1.start();
		t2.start();
		
		
	}

	@Override
	public void run() {
		
		System.out.println("Started " + Thread.currentThread());
		// calling yield() method on current thread to move it
        // back to ready state from running state
		Thread.yield();
		
		System.out.println("Ended " + Thread.currentThread());
	}

}
