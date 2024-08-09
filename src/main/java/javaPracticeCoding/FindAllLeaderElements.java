package javaPracticeCoding;

public class FindAllLeaderElements {
	
	public void leaderElements(int arr[]) {
		//store the last value in the max 
		int max = arr[arr.length-1];
		
		//print the max value
		System.out.print(max + " ");
		
		//using the for loop iterate the array
		for(int i = arr.length-2;i>=0;i--) {
			//compare the array element with the max value
			if(arr[i]>max) {
				System.out.print(arr[i]);
				max = arr[i];
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {78,56,54,34,23,89,90};
		FindAllLeaderElements leader  = new FindAllLeaderElements();
		leader.leaderElements(arr);
		
		int arr1[] = new int[] {23,54,100,67,87,34,3,100};
		leader.leaderElements(arr1);

	}

}
