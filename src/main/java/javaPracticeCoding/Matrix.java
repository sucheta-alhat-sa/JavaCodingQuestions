package javaPracticeCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the row count: ");
		int rows = scan.nextInt();
		
		System.out.println("Enter the colummn count: ");
		int columns = scan.nextInt();
		
		int data[][] = new int[rows][columns];
		System.out.println("Enter the matrix data: ");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				data[i][j] = scan.nextInt();
			}
		}
		
		//traverse the matrix:
		System.out.println(Arrays.deepToString(data));

	}

}
