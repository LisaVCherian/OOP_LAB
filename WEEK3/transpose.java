//Write a Java program to display the transpose of a given matrix

import java.util.*;
class transpose{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int m,n;
	System.out.print("Enter the number of rows: ");
	m = sc.nextInt();
	System.out.print("Enter the number of columns: ");
	n = sc.nextInt();
	
	int arr[][] = new int[10][10];
	System.out.println("\nEnter the matrix elements: ");
	for(int i = 0; i<m; i++)
		for(int j = 0; j<n; j++)
			arr[i][j] = sc.nextInt();

	System.out.println("\nThe matrix is: ");
	for(int i = 0; i<m; i++){
		for(int j = 0; j<n; j++)
			System.out.print(arr[i][j]+" ");
		System.out.println("");
	}

	int brr[][] = new int[10][10];
	for(int i = 0; i<m; i++)
		for(int j = 0; j<n; j++)
			brr[j][i]=arr[i][j];

	System.out.println("\nThe transpose is: ");
	for(int i = 0; i<m; i++){
		for(int j = 0; j<n; j++)
			System.out.print(brr[i][j]+" ");
		System.out.println("");
	}

	}
}
