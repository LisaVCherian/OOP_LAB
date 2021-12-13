//Find the sum of digits in an integer read from the keyboard

import java.util.Scanner;

class largest{
	public static void main(String args[]){
		Scanner inputObj = new Scanner(System.in);
		System.out.print("Total numbers: ");
		int n = inputObj.nextInt();
		int max = 0;
		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++)
		{
			int currentdigit = inputObj.nextInt();
			if(currentdigit > max)
				max = currentdigit;
		}
		System.out.println("Largest number is: "+max);
	}
}
