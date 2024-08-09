package javaPracticeCoding;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row count for matrix: ");
		int rows = scan.nextInt();
		
		System.out.println("Enter the col count for matrix: ");
		int cols = scan.nextInt();
		
		int matrix[][] = new int[rows][cols];
		int transpose[][] = new int[rows][cols];
		
		System.out.println("Enter the matrix data: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("matrix: ");
		for(int[] r : matrix) {
			System.out.println(Arrays.toString(r));
		}
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		
		System.out.println("matrix transpose: ");
		
		for(int[] r : transpose) {
			System.out.println(Arrays.toString(r));
		}
		
		
		
		

	}

}
