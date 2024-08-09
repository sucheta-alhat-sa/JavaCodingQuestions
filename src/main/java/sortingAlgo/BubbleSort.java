package sortingAlgo;

	import java.util.Arrays;
	
	public class BubbleSort {
	
		public static void bubbleSort(int arr[]) {
			// 5,4,3,2,1 =>
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) { // 5>4
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
	
		}
	
		public static void main(String[] args) {
			int arr[] = { 100, 5, 4, 3, 2, 1, 0, -1, -2, 10, 20 };
			bubbleSort(arr);
	
		}
	
	}
