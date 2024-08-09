package javaLatestFeatures;

@FunctionalInterface
public interface Square { //functional interface has only one abstract method and can contain multiple static and default methods
	//abstract keyword is not mandatory here
//	methods are implemented using lambda
	
	
	public int calculate(int x);
	
	/* some other functional interfaces
Runnable –> This interface only contains the run() method.
Comparable –> This interface only contains the compareTo() method.
ActionListener –> This interface only contains the actionPerformed() method.
Callable –> This interface only contains the call() method.
	 */

}
