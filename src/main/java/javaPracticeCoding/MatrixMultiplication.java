package javaPracticeCoding;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first matrix row count: ");
		int firstMatrixRows = scan.nextInt();

		System.out.println("Enter the first matrix col and second martix row count: ");
		int firstMatrixColAndSecondMatrixRow = scan.nextInt();

		System.out.println("Enter the col count for second matrix: ");
		int secondMatrixCol = scan.nextInt();

		int matrix1[][] = new int[firstMatrixRows][firstMatrixColAndSecondMatrixRow];
		int matrix2[][] = new int[firstMatrixColAndSecondMatrixRow][secondMatrixCol];
		int product[][] = new int[firstMatrixRows][secondMatrixCol];

		System.out.println("Enter the first matrix data: ");

		for (int i = 0; i < firstMatrixRows; i++) {
			for (int j = 0; j < firstMatrixColAndSecondMatrixRow; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}

		System.out.println("Enter the second matrix data: ");

		for (int i = 0; i < firstMatrixColAndSecondMatrixRow; i++) {
			for (int j = 0; j < secondMatrixCol; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}

		for (int[] r : matrix1) {
			System.out.println(Arrays.toString(r));
		}

		for (int[] r : matrix2) {
			System.out.println(Arrays.toString(r));
		}

//		product
		for (int i = 0; i < firstMatrixRows; i++) {
			for (int j = 0; j < secondMatrixCol; j++) {
				for (int k = 0; k < firstMatrixColAndSecondMatrixRow; k++) {
					product[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		System.out.println("matrix product: ");
		for (int[] r : product) {
			System.out.println(Arrays.toString(r));
		}

	}

}
