package javaPrograms;

public class ThreadCode extends Thread{
	
	public void doTask() {
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			System.out.println(" " + i);
		}
	}

	public static void main(String[] args) {
		ThreadCode task = new ThreadCode();
		task.doTask();

	}

}
