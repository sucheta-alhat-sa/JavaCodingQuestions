package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		// 8 2 4 1 3
		
		int min = 0;
		for(int i=0;i<arr.length;i++) {
			min = i;
			//for loop to find the min element
			for(int j=i+1; j<arr.length;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			//place the smallest found num in the lowest_num
			int lowest_num = arr[min];
			arr[min] = arr[i];
			arr[i] = lowest_num; // 1 2 4 8 3
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = {8,2,4,1,3};
		selectionSort(arr);
		

	}

}
