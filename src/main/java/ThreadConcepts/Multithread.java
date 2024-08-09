package ThreadConcepts;

public class Multithread {

	public static void main(String[] args) {
		
		int n = 10;
		for(int i=0;i<n;i++) {
			MultithreadingDemo demo = new MultithreadingDemo();
			demo.start();
		}

	}

}
