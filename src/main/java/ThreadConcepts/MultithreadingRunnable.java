package ThreadConcepts;

public class MultithreadingRunnable  implements Runnable{

	@Override
	public void run() {
		try {
		System.out.println("Thread: " +Thread.currentThread().getId()+ "is running");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
