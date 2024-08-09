package javaPracticeCoding;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int rows = scan.nextInt();

		System.out.println("Enter the cols: ");
		int cols = scan.nextInt();

		int data1[][] = new int[rows][cols];
		int data2[][] = new int[rows][cols];

		System.out.println("Enter the matrix 1 data: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data1[i][j] = scan.nextInt();
			}
		}

		for (int r[] : data1) {
			System.out.println(Arrays.toString(r));
		}

		System.out.println("Enter the matrix 2 data: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				data2[i][j] = scan.nextInt();
			}
		}

		for (int r[] : data2) {
			System.out.println(Arrays.toString(r));
		}

		int sum[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum[i][j] = data1[i][j] + data2[i][j];
			}
		}
		System.out.println("matrix addition output: ");
		for (int r[] : sum) {
			System.out.println(Arrays.toString(r));
		}
		
		int sum1[][] = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				sum1[i][j] = data1[i][j] - data2[i][j];
			}
		}
		System.out.println("matrix subtraction output: ");
		for (int r[] : sum1) {
			System.out.println(Arrays.toString(r));
		}

	}

}
