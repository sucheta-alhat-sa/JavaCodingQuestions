package ThreadConcepts;

public class MultithreadingDemo extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("Thread " +Thread.currentThread().getId()+ "is running" );
		}catch(Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}

}


