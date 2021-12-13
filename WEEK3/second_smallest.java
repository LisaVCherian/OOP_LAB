//Write a Java program to find the second smallest element in an array

import java.util.*;
class second_smallest{

	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int n, temp;
	int arr[] = new int[10];
	System.out.print("\nEnter the size of array: ");
	n = sc.nextInt();
	System.out.println("\nEnter the numbers: ");
	for(int i = 0; i<n; i++)
		arr[i] = sc.nextInt();

	for(int i = 0; i<n; i++)
	{
		for(int j = i+1; j<n; j++)
		{
			if(arr[j]<arr[i])
			{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("\nSecond smallest number: " + arr[1]);
	
	}
}
