package ThreadConcepts;

public class MultithreadThreadRunnableDemo {

	public static void main(String[] args) {
		MultithreadThreadRunnable thread = new MultithreadThreadRunnable();
		Thread t1 = new Thread(thread);
		t1.start();

	}

}
