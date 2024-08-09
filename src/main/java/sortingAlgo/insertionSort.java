package sortingAlgo;

import java.util.Arrays;

public class insertionSort {
	public static void insertionSortAlgo(int arr[]) {
		// 8,2,4,1,3

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;// 0

			while (j >= 0 && arr[j] > current) { // 0>=0 8>2
				arr[j+1] = arr[j]; // 8->2 -> ->8
				j--;
			}
			arr[j+1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 8, 2, 4, 1, 3 };

		insertionSortAlgo(arr);

	}

}
